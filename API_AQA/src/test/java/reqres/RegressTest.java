package reqres;

import com.google.gson.JsonObject;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.Assert;
import org.junit.Test;
import reqres.colors.ColorsData;
import reqres.registration.Register;
import reqres.registration.SuccessReg;
import reqres.registration.UnSuccessReg;

import reqres.user.UserData;
import reqres.user.UserTime;
import reqres.user.UserTimeResponse;

import java.io.IOException;
import java.time.Clock;
import java.util.List;
import static io.restassured.RestAssured.given;
import spec.JsonFileDownloader;
import spec.Specifications;

public class RegressTest {
    private final static String URL = "https://reqres.in";
    private final static String SchemaLOCAL = "schema.json";

    @Test
    public void GetTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec200OK());
        List<UserData> users = given()
                .when()
                .get("/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        users.stream().forEach(avatar -> Assert.assertTrue(avatar.getAvatar().contains(avatar.getId().toString())));

        Assert.assertTrue(users.stream().allMatch(mail->mail.getEmail().endsWith("@reqres.in")));

        List<String> avatars = users.stream().map(UserData::getAvatar).toList();
        List<String> ids = users.stream().map(id->id.getId().toString()).toList();

        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }
    @Test
    public void PostSuccessRegTest() throws IOException {

        JsonFileDownloader.fileUrl = "https://drive.google.com/uc?id=189Z9dHhzQkS3BwwkGQ2UGvSGBAMn1JQT&export=download";
        JsonFileDownloader.run();

        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec200OK());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in","pistol");

        SuccessReg successReg = given()
                .body(user)
                .when()
                .post("/api/register")
                .then().log().all()
                .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(SchemaLOCAL))
                .extract().as(SuccessReg.class);

        Assert.assertNotNull(successReg.getId());
        Assert.assertNotNull(successReg.getToken());

        Assert.assertEquals(id, successReg.getId());
        Assert.assertEquals(token, successReg.getToken());
    }
    @Test
    public void PostUnSuccessRegTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec400Error());
        Register user = new Register("sydney@fife","");
        UnSuccessReg unSuccessReg = given()
                .body(user)
                .post("/api/register")
                .then().log().all()
                .extract().as(UnSuccessReg.class);

        Assert.assertEquals("Missing password",unSuccessReg.getError());
    }
    @Test
    public void GetColorsSortedByYearsTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec200OK());
        List<ColorsData> colors = given()
                .when()
                .get("/api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data",ColorsData.class);

        List<Integer> years = colors.stream().map(ColorsData::getYear).toList();
        List<Integer> sortedYears = years.stream().sorted().toList();

        Assert.assertEquals(sortedYears,years);

    }
    @Test
    public void DeleteUserTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecUniq(204));
        given()
                .when()
                .delete("/api/users/2")
                .then().log().all();
    }
    @Test
    public void timeUserTest(){
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec200OK());
        UserTime user = new UserTime("morpheus","zion resident");
        UserTimeResponse response = given()
                .body(user)
                .when()
                .put("/api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class);

        String regexSys = "(.{12})$";
        String regexRes = "(.{6})$";

        String currentTime = Clock.systemUTC().instant().toString().replaceAll(regexSys,"");
        String responseTime = response.getUpdatedAt().replaceAll(regexRes,"");

        Assert.assertEquals(currentTime,responseTime);

    }
}
