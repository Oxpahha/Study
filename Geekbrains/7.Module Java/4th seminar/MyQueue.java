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

    boolean empty(){
        return list.isEmpty();
    }

    void enqueue(Object obj){
        //помещает элемент в конец очереди
        list.addLast(obj);
    }
    Object dequeue(){
        //возвращает первый элемент из очереди и удаляет его
        if(!empty()){
            Object temp = list.get(0);
            list.remove(0);
            return temp;
        }
        return null;
    }
    Object first(){
        //возвращает первый элемент из очереди, не удаляя
        if(!empty()){
            return list.get(0);
        }
        return null;
    }

}