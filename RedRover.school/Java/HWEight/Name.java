public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getFullName(){
        return (firstName+" "+lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return (firstName + " " + lastName);
    }

}
