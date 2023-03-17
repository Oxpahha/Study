public class Person {
    Name name;
    int age;

    String getFullInfo(){
        return ("Name: " + name.getFullName() + ", Age: " + age);
    }
}
