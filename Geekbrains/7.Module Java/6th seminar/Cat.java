import java.util.Objects;

/*
    1. Продумайте структуру класса Кот.
       Какие поля и методы будут актуальны для приложения, которое является
        а) информационной системой ветеринарной клиники
        б) архивом выставки котов
        в) информационной системой Театра кошек Ю. Д. Куклачёва
        Можно записать в текстовом виде, необязательно реализовывать в java.
*/
public class Cat {
    String name;
    int age;
    String ownerName;
    String doctorName;
    void sayMaw(){
        System.out.println("Maw-Maw");
    }
    String getName() {
        return name;
    }
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", ownerName='" + ownerName + '\'';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age
            && Objects.equals(name, cat.name)
            && Objects.equals(ownerName, cat.ownerName)
            && Objects.equals(doctorName, cat.doctorName);
    }
    public int hashCode() {
        return Objects.hash(name, 7*age, ownerName, doctorName);
    }
}
