package api;
import java.util.List;
import java.util.stream.Collectors;

import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class RegressTest {
    private final static String URL = "https://reqres.in";
    @Test
    public void checkTest(){
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL+"/api/users?page=2")
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
}
