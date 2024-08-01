package Multithread.commsuner;

/**
 * 了解线程通信
 * 前提保证线程安全
 */
public class Demo {
    public static void main(String[] args) {
        //需求：3个生产者线程（厨师），负责生产，每个线程只能生产一个，桌子只能有一个产品
        Boom boom = new Boom();
//    使用匿名内部类方法创建线程
        new  Thread(() ->{

            while (true) {
                boom.put();
            }
        },"生产者1").start();
        new  Thread(() ->{

            while (true) {
                boom.put();
            }
        },"生产者2").start();
        new  Thread(() ->{

            while (true) {
                boom.put();
            }
        },"生产者3").start();

        //2个消费者线程负责消费，每人每次只能消费一次
        new  Thread(() ->{

            while (true) {
                boom.get();
            }
        },"消费者1").start();
        new  Thread(() ->{

            while (true) {
                boom.get();
            }
        },"消费者2").start();


    }


}
