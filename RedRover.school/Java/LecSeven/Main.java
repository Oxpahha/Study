public class Les7 {
    public static void main(String[] args) {
        Person john = new Person();
        Name name = new Name();
        name.firstName = "John";
        name.lastName = "Doe";
        john.name = name;
        john.age = 26;

        Person jane = new Person();
        name = new Name();
        name.firstName = "Jane";
        name.lastName = "Doe";
        jane.name = name;
        jane.age = 21;

        System.out.println(john.getFullInfo());
        System.out.println(jane.getFullInfo());
    }
}
