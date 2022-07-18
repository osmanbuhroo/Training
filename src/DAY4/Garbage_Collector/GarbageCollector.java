package DAY4.Garbage_Collector;

public class GarbageCollector {

    public void finalize() {
        System.out.println("Calling Garbage Collector...");
    }
    public static void main(String[] args) {
        GarbageCollector gc = new GarbageCollector();
        gc = null;

        System.gc();
    }
}
