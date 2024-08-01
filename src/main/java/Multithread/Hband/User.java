package Multithread.Hband;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class User {
    private double rent;
    private  int id;

    private final   Lock lk =  new ReentrantLock();

    public User(){

    };

    public User(int rent, int id) {
        this.rent = rent;
        this.id = id;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getId() {
        return id;
    }
    public void setId(int  id) {
        this.id = id;

    }

    //        小红和小明谁来取，可以在类方法上再加一个名称属性，设置线程名称
    public  void memoly(double money) {
//        获取当前线程名称
        String name = Thread.currentThread().getName();

        /**
         * 利用同步代码块
         * 解决安全问题
         *1. synchronized代码块，（）指定标识
         * 但是问题也会锁住另一类的资源，所以用this共享资源
         * 2.同步方法，在方法名，返回值前加上synchronized,使用的this共享资源
         * 3.lock锁
         */
//        1.判断是否可以取钱
//        用this代表共享资源
//        synchronized (this) {
//            if (this.rent >=money ){
//                System.out.println(name + "取钱"+ rent +"成功");
//                this.rent -= money;
//                System.out.println(name +"取走了,剩余" + rent  );
//            }else {
//                System.out.println(name + "余额不足！");
//            }
//        }
        lk.lock();
        try {
            if (this.rent >=money ){
                System.out.println(name + "取钱"+ rent +"成功");
                this.rent -= money;
                System.out.println(name +"取走了,剩余" + rent  );
            }else {
                System.out.println(name + "余额不足！");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }


    }
}
