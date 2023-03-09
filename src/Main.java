public class Main {
    public static void main(String[] args) {

        DynStack ds = new DynStack();
        ds.push("First");
        ds.push("Second");
        ds.push("Third");

        System.out.println(ds);

        // testing pop
        System.out.println(ds.pop());
        System.out.println(ds);

        // testing peek
        System.out.println(ds.peek());
        System.out.println("Stck after peek");
        System.out.println(ds);
    }
}