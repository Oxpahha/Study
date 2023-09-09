package reqres.registration;

import com.fasterxml.jackson.annotation.JsonCreator;

public class SuccessReg {
    public Integer id;
    public String token;
    @JsonCreator
    public SuccessReg() {
    }

    public SuccessReg(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
