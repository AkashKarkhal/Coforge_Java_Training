public class staticcblockk {
    static{
        System.out.println("Static block 1");
    }
    static{
        System.out.println("Static block2");
    }

    public static void main(String[] args) {
        System.out.println(":inside the main method");
    }

     static{
        System.out.println("Static block3");
    }

}
