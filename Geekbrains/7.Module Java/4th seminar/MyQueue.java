import java.util.LinkedList;

/*
2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/
public class MyQueue {

    private LinkedList<Object> list;

    MyQueue() {
        list = new LinkedList<>();
    }

    void enqueue(Object obj){
        //помещает элемент в конец очереди
        list.addLast(obj);
    }
    Object dequeue(){
        //возвращает первый элемент из очереди и удаляет его
        Object temp = list.get(0);
        list.remove(0);
        return temp;
    }
    Object first(){
        //возвращает первый элемент из очереди, не удаляя
        return list.get(0);
    }

}