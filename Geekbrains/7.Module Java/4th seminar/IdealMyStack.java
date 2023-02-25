import java.util.*;
public class IdealMyStack < E > {

    public static final int CAPACITY = 1000; // default array capacity
    private int topIndex; // index of the top element in stack
    private E[] data; // generic array used for storage

    public IdealMyStack() {
        this(CAPACITY);
    } // constructs stack with default capacity

    public IdealMyStack(int capacity) { // constructs stack with given capacity
        topIndex = -1;
        data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
    }

    public int size() {
        return (topIndex + 1);
    }

    public boolean empty() {
        return (topIndex == -1);
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++topIndex] = e; // increment topIndex before storing new item
    }

    public E peek() throws EmptyStackException {
        if (empty()) throw new EmptyStackException();
        return data[topIndex];
    }
}
