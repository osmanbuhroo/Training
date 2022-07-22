package Day6.Threads.UsingClass;

public class CreatingThreads extends Thread
{
    public void run()
    {
        System.out.println("Name "+Thread.currentThread().getName());
        System.out.println("Is Daemon "+Thread.currentThread().isDaemon());
    }
    public static void main(String[] args)
    {
        CreatingThreads t1 = new CreatingThreads();
        CreatingThreads t2 = new CreatingThreads();
        t2.start();
        t1.setDaemon(true);
        t1.start();
    }
}

