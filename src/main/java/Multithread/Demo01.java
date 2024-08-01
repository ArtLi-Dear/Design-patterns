package Multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 多线程
 * 线程创建
 */
public class Demo01 {
    /**
     * 线程创建方式一
     */
//        //    main方法也是一个主线程
//        public static void main(String[] args) {
//    //    创建线程,是对Java、多态的运用,类对象的创建
//            MyThread thread = new MyThread();
//    //        启动线程调用start方法,子线程会自动执行run方法
//            thread.start();
//            for (int i = 0; i < 10; i++) {
//                System.out.println("主线程main输出" + i);
//            }
//            ;
//
//        }

    /**
     *  方式二：实现runnable接口开启多线程
     *  定义一个runnable任务类
     */
//    public static void main(String[] args) {
//
//
//        Runnable myRunnabel = new MyRunnabel();
////        任务类不能直接调用start方法
////        需要用到thread中的类方法
////        把任务对象交给一个线程处理
//        new Thread(myRunnabel).start();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("主线程："+ i);
//        }
//        /**
//         * 方式二的匿名内部类写法
//         */
//
//      Runnable runnable =  new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("线程1：" + i);
//                }
//            }
//        };
//      new  Thread(runnable).start();
//
////        函数式接口，可用lamda方式写法
//      new Thread(() -> {
//          for (int i = 0; i < 5; i++) {
//              System.out.println("线程2："+ i);
//          }
//      }).start();
//
//         for (int i = 0; i < 5; i++) {
//            System.out.println("主线程："+ i);
//        }
//    }


    /**
     * 创建线程方式三：
     * 1.创建任务对象
     * 定义一个类Callable接口，重写call，封装业务逻辑和返回数据
     * 把Callable类型的对象封装成FutureTask（线程任务对象）。
     * 2.把线程任务对象交给Thread对象
     * 3.调用Thread对象 的start方法启动线程
     * 4.线程执行完毕后、通过FutureTask对象的get方法去获取线程任务执行结果
     *
     * 优点：扩展性更强，并且可以获取线程执行完成后结果
     *
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new MyCallable();

//        未来任务对象的作用：
//        是一个任务对象，实现了Runnable对象
//        线程执行完毕后、通过FutureTask对象的get方法去获取线程任务执行结果
        FutureTask<String> task = new FutureTask<>(callable);

//        调用Thread对象 的start方法启动线程
        new Thread(task).start();

//        执行完毕，获取执行结果
        String res = task.get();
        System.out.println(res);
    }
}
/**
 * 总结
 * 线程创建
 * 方式一：通过类继承Thread类，调用start方法实现
 * 方式二：通过实现Runnable任务类接口，重写run方法，
 * 再通过创建runnable类对象，用Thread类中的方法，放入run对象，再调用start方法启用线程
 *
 * 方式三：通过类实现Callable接口，重写call方法，定义业务逻辑和返回值，
 * 创建callable对象，通过封装成FutureTask对象，放入callable任务对象，
 * 再创建Thread类调用start方法启动线程，并且可以获取线程执行结果
 *
 * 优缺点：
 * 方式一：实现简单，但由于只能继承一个实现类，扩展性差，无返回值
 * 方式二：通过实现runnable接口，定义任务，可以继承其他类,扩展性强，无返回值
 * 方式三：扩展性更强，通过实现callable接口，重写call方法，可以继续继承类和实现接口，扩展性强
 * 有返回值，可以在线程执行完成后获取结果，编码相对复杂
 */