import java.util.*;

public class MyQueue {

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<Integer>();

        // Add elements to the Queue
        q1.add(18);

        q1.add(37);

        q1.add(41);

        q1.add(85);

        q1.add(54);

        q1.add(21);

        System.out.println("Elements in Queue:" + '\n' + q1);

        System.out.print("Elements removed from the Queue: \n" + q1.remove());

        System.out.println(" " + q1.remove());

        System.out.println("Remaining Elements in Queue: " + '\n' + q1);

    }
}
