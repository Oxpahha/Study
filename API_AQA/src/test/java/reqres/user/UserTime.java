package reqres.user;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UserTime {
    private String name;
    private String job;

    @JsonCreator
    public UserTime(){

    }
    public UserTime(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
