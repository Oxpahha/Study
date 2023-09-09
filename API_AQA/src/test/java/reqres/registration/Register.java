package reqres.registration;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Register {
    private String email;
    private String password;

    @JsonCreator
    public Register() {
    }
    public Register(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
