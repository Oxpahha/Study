package reqres.registration;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UnSuccessReg {
    private String error;
    @JsonCreator
    public UnSuccessReg() {
    }

    public UnSuccessReg(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
