public class Gender {
    private final Integer type;

    public Gender(int type){
        this.type = type;
    }
    String getGender() {
        switch (type) {
            case 1 -> {
                return "Mr.";
            }
            case 2 -> {
                return "Ms.";
            }
            default -> {
                return "";
            }
        }
    }

}