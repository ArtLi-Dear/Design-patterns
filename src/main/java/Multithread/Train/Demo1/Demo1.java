package Multithread.Train.Demo1;

import java.util.ArrayList;
import java.util.Random;

public class Demo1 {



    public static void main(String[] args) throws Exception {

        //有100份礼品，小红，小明两人同时发送，当剩下的礼品小于10份的时候则不再送出，
        // 利用多线程模拟该过程并将线程的名称打印出来。并最后在控制台分别打印小红，小明各自送出多少分礼物。
        ArrayList<String> list = new ArrayList<>();
//        1.创建数据先插入礼品集合
        String [] gifts = {"手表","鲜花","包包","鞋子"};
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            //添加随机值，及索引下标
            list.add(gifts[random.nextInt(gifts.length)] + (i + 1));
        }
        System.out.println(list);

//        创建两个线程
//        获取记录数
        new MyRunnable(list,"小红").start();
        new MyRunnable(list,"小明").start();

//        MyRunnable count1 = new MyRunnable(list,"小红");
//        count1.start();
//
//        MyRunnable count2 = new MyRunnable(list,"小明");
//        count2.start();
//
//        //如果这个通过，表示以上线程一定运行完毕
//        count1.join();
//        count2.join();
//
//        System.out.println(count1.getCount());
//        System.out.println(count2.getCount());
    }

}
