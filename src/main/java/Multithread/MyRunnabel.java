package Multithread;
/**
 * 方法二：实现runnable接口
 * 定义一个任务类
 *
 * 优点：可以扩展功能，可以继承其他类，实现其他接口
 * 缺点：需要多创建一个任务类
 */
public class MyRunnabel implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程：" + i);
        }
    }
}
