import java.util.Enumeration;
import java.util.Vector;

public class vector_example {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(56);
        vector.add(90);
        vector.add(40);

        System.out.println(vector);
        System.out.println("Capacity: " + vector.capacity());

        Enumeration<Integer> e = vector.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}