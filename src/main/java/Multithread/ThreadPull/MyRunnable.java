package Multithread.ThreadPull;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "66666666");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
