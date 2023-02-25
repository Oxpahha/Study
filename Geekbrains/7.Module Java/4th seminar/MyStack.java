
import java.util.Arrays;

/*
Реализовать стек с помощью массива.
Создать новый класс и свою реализацию методов.
size(),empty(),push(),peek(),pop()
 */
public class MyStack {
    private int[] array;
    private int size;

    MyStack(){
        array = new int[8];
    }

    int size(){
        return size;
    }
    boolean empty(){
        return size==0;
    }
    void push(int element){
        if (array.length <= size){
            int[] array2 = new int[array.length*2];
            System.arraycopy(array,0,array2,0, array.length);
            array = array2;
        }
        array[size] = element;
        size++;
    }
    int peek(){
        return array[size-1];
    }
    int pop(){
        int out = array[size-1];
        size--;
        return out;
    }

    public String toString() {
        // на скорую руку, лучше собрать через StringBuilder
        int[] print = new int[size];
        System.arraycopy(array,0,print,0,size);
        return Arrays.toString(print);
    }
}
