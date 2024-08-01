package Multithread.ThreadPull;

import java.util.concurrent.*;

/**
 * ThreadPoolExecutor构造器
 * 参数一:corePoolSize:指定线程池的核心线程的数量，
 * 参数二:maximumPoolSize:指定线程池的最大线程数量，
 * 参数三:keepAliveTime:指定临时线程的存活时间。
 * 参数四:unit:指定临时线程存活的时间单位(秒、分、时、天)
 * 参数五:workQueue:指定线程池的任务队列。
 * 参数六:threadFactory:指定线程池的线程工厂。
 * 参数七:handler:指定线程池的任务拒绝策略(线程都在忙，任务队列也满了的时候，新任务来了该怎么处理)
 */
public class MyThreadPool {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程池,通过ThreadPoolExecutor创建线程池对象
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS
//                , new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());
//线程池处理runnable任务

//        MyRunnable myRunnable = new MyRunnable();
//        //放入任务，线程池自动创建，自动执行
//        executor.execute(myRunnable);
//        executor.execute(myRunnable);
//        executor.execute(myRunnable);
        //等待任务执行完，自动结束线程池
//        executor.shutdown();
//        直接结束任务
//        executor.shutdownnow();

//线程池处理callable任务
//        executor.submit可以直接
//        Future<String> res = executor.submit(new MyCallable());
//        Future<String> res1 = executor.submit(new MyCallable());
//        Future<String> res2 = executor.submit(new MyCallable());
//        Future<String> res3 = executor.submit(new MyCallable());
//
//        System.out.println(res.get());
//        System.out.println(res1.get());
//        System.out.println(res2.get());
//        System.out.println(res3.get());
//        executor.shutdown();

        //通过executor工具类创建线程池对象
        //但是不允许使用Executor创建线程池，而是使用ThreadPoolExecutor的方式
        ExecutorService pool = Executors.newFixedThreadPool(3);

        /**
         *   核心线程数配置：
         *   计算密集型（涉及计算）的任务，核心线程数量 = CPU的核数 + 1
         *   计算IO型的任务（涉及文件传输），核心线程数量 = CPU的核数 * 2
         */
    }

}
