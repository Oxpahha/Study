package api;

public class UserTimeResponse extends UserTime {
    private String updatedAt;
    public UserTimeResponse(String name, String job, String updateTime) {
        super(name, job);
        this.updatedAt = updateTime;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
