package Multithread;

/**
 * 方法一：创建子类
 * 创建线程，让子类继承Thread
 *
 * 优点：编码简单
 * 缺点：线程类已经继承Thread，无法继承其他类，不利于功能扩展
 */
public class MyThread extends Thread{
//    1.必须重写Thread中的run方法

    @Override
    public void run() {
//        描述线程任务
        for (int i =0;i<10 ; i++){
            System.out.println("子线程MyThread输出" + i);
        }
    }
}
