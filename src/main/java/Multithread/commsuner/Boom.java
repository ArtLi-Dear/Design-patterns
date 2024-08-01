package Multithread.commsuner;

import java.util.ArrayList;
import java.util.List;

public class Boom {

//    定义产品列表
     List<String> list = new ArrayList<>();



     /**
      * 生产者，生产逻辑
      * 保证线程安全，加synchronized
      */
     public synchronized void put() throws RuntimeException {
          try {
//          获取当前线程名
               String name = Thread.currentThread().getName();
//          列表中没有数据则生产一条数据
               if (this.list.size() == 0){
                    list.add("食物");
                    System.out.println(name + "生产了一个"+ list.get(0));
                    Thread.sleep(2000);

     //               先唤醒其他人
                    this.notifyAll();
     //               再等待自己
                    this.wait();
               }else {
     //          有就不做
                    this.notifyAll();
                    this.wait();
               }
          } catch (Exception e) {
               throw new RuntimeException(e);
          }

     }

     /**
      * 消费者
      */
     public synchronized void get() {
          try {
               String name = Thread.currentThread().getName();

               if (this.list.size() == 1){
                    System.out.println(name + "吃掉了一个"+list.get(0));
                    list.clear();
                    Thread.sleep(1000);
                    this.notifyAll();
                    this.wait();

               }else {
                    this.notifyAll();
                    this.wait();
               }
          } catch (InterruptedException e) {
               throw new RuntimeException(e);
          }

     }
}
