package reqres.user;

import com.fasterxml.jackson.annotation.JsonCreator;

public class OtherRequest {

    private String name;
    private Integer uniqId;
    private String registrationToken;
    private String date;

    @JsonCreator
    public OtherRequest() {
    }

    public OtherRequest(String name, Integer uniqId, String registrationToken, String date) {
        this.name = name;
        this.uniqId = uniqId;
        this.registrationToken = registrationToken;
        this.date = date;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getUniqId() {
        return uniqId;
    }
    public void setUniqId(Integer uniqId) {
        this.uniqId = uniqId;
    }
    public String getRegistrationToken() {
        return registrationToken;
    }
    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}