import java.util.HashSet;

public class retain_example_in_hashset {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(40);
        set2.add(50);

        System.out.println("Before: " + set1);

        set1.retainAll(set2);

        System.out.println("After: " + set1);
    }
}