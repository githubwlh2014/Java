package jointest;

public class JoinTest {
    public static void main(String[] args) {
        Thread t = new Thread(new RunnableImpl());
       new ThreadTest(t).start();
        t.start();
        try {
        	System.out.println("����joinǰ");
            t.join();
            System.out.println("joinFinish");
        } catch (InterruptedException e) {
            e.printStackTrace();	     
        }
    }
}

class ThreadTest extends Thread {

    Thread thread;

    public ThreadTest(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
    	synchronized (thread) {
            System.out.println("getObjectLock");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException ex) {
             ex.printStackTrace();
            }
            System.out.println("ReleaseObjectLock");
        }
    }
}

class RunnableImpl implements Runnable {

    public void run() {
        try {
            System.out.println("Begin sleep");
            Thread.sleep(2000);
            System.out.println("End sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}