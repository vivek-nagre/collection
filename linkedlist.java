import java.util.LinkedList;
import java.util.Queue;
public class linkedlist {
    public static void main(String[] args) {
        System.out.println("this is all about linked list in Queue");
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        

    }
}
