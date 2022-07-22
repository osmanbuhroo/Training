package Day6.Threads.UsingClass;

class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(" From ThreadA: i= "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" From ThreadB: j= "+j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {

            System.out.println(" From ThreadC: k= "+k);
        }

        System.out.println("Exit from C");
    }
}
class ThreadTest {
    public static void main(String args[]) {
        new A().start();
        new B().start();
        new C().start();
    }
}

