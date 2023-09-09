package reqres.user;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UserTimeResponse extends UserTime {
    private String updatedAt;
    @JsonCreator
    public UserTimeResponse(){}
    public UserTimeResponse(String name, String job, String updateTime) {
        super(name, job);
        this.updatedAt = updateTime;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
