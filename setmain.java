import java.util.HashSet;

public class setmain {
    public static void main(String[] args) {

        HashSet<Integer> hset = new HashSet<Integer>();

        // hset.add(10);
        // hset.add(67);
        // hset.add(45);
        // hset.add(12);
        // hset.add(89);
        // hset.add(12);
        // hset.add(56);
        // hset.add(12);
        // hset.add(null);
        // hset.add(null);

        // System.out.println(hset);

        // System.out.println(hset.size());

        // System.out.println(hset.contains(45));

        // hset.remove(67);
        // System.out.println(hset);

        // System.out.println(hset.isEmpty());

        // System.out.println(hset.clone());

        // Object[] arr = hset.toArray();
        // for (Object i : arr) {
        //     System.out.print(i + " ");
        // }

        // hset.clear();
        // System.out.println("\n" + hset);

        hset.add(65);
        hset.add(85);
        hset.add(13);
        hset.add(1);
        hset.add(89);
        hset.add(121);
        hset.add(56);
        hset.add(78);
       System.out.println(hset);

       hset.retainAll(hset);
       System.out.println(hset);
    }
}