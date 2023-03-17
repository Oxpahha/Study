public class Gender {
    Integer type;
    String getGender() {
        switch (type) {
            case 1 -> {
                return "Mr.";
            }
            case 0 -> {
                return "Ms.";
            }
            default -> {
                return "";
            }
        }
    }
}