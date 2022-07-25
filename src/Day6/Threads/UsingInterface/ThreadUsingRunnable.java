package Day6.Threads.UsingInterface;

public class ThreadUsingRunnable implements  Runnable {
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()
                + " run()  method is executed");


    }



        public static void main(String[] args)
        {
            System.out.println("executed thread is- "
                    + Thread.currentThread().getName());
            Thread t1 = new Thread(new ThreadUsingRunnable());
            t1.start();
        }


    }