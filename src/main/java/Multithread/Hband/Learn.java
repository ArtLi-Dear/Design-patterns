package Multithread.Hband;

/**
 * 多线程安全问题
 * 银行交易问题
 */
public class Learn {

    public static void main(String[] args) {
//        1.创建一个共同的账号对象
        User user = new User(10000,1);
//创建两个线程，分别代表小明，小红
        new Change(user,"小明").start();

        new Change(user,"小红").start();

//        1.创建一个共同的账号对象
        User user1 = new User(10000,2);
//创建两个线程，分别代表小明，小红
        new Change(user1,"小黑").start();

        new Change(user1,"小白").start();




    }

}
