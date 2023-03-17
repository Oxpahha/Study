public class Person {
    Name name;
    Gender gender;
    int age;


    String getName(){
        return (gender.getGender() + name.getFullName());
    }
    String getFullInfo(){
        return ("Name: " + name.getFullName() + ", Age: " + age);
    }
}
