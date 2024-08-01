package Multithread.ThreadPull;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public String call() throws Exception {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("线程1：" + i);
            count++;
        }

        return Thread.currentThread().getName()+"循环次数-----》" + count;
    }
}
