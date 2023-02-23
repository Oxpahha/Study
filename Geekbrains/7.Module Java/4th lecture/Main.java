import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.*;

public class Main {
    
    static void lecFourTaskOne_List(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.offerFirst(1);
        deque.offerLast(2);
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque.getFirst());
        System.out.println(deque);
        System.out.println(deque.peekLast());
        System.out.println(deque);
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    static void lecFourTaskTwo(){
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -

        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3

        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}

    
