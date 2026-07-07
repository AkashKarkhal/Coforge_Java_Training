import java.util.PriorityQueue;

public class Prioritymain {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(87);
        pq.add(76);
        pq.add(34);
        pq.add(2);
        pq.add(9);

        System.out.println(pq); // automatically sort the elements....
        System.out.println(pq.poll()); // poll will provide smallest element in the queue and remove that elements...
        System.out.println(pq);



    }

}
