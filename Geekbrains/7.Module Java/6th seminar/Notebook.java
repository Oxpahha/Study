import java.util.Objects;
public class Notebook {
    String name;
    int price;
    int ram;
    int hdd;
    String opSys;
    String color;


    int getPrice() {
        return price;
    }


    public String toString() {
        return "Name= "    + name  +
             ", Price= "   + price +
             ", Ram= "     + ram   +
             ", HDD= "     + hdd   +
             ", OperSys= " + opSys +
             ", Color= "   + color ;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebooks = (Notebook) o;
        return price == notebooks.price
              && ram == notebooks.ram
              && hdd == notebooks.hdd
              && Objects.equals(name, notebooks.name)
              && Objects.equals(opSys, notebooks.opSys)
              && Objects.equals(color, notebooks.color);
    }

    public int hashCode() {
        return Objects.hash(name, 7*price, 3*ram, 13*hdd, opSys, color);
    }
}
