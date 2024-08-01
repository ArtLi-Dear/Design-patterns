package Multithread.Train.Demo1;

import java.util.List;
import java.util.Random;

public class MyRunnable extends Thread{


    private  List<String> gift;

    public MyRunnable(List<String> gift, String name) {
        super(name);
        this.gift = gift;

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        Random random = new Random();
        //获取到礼物发放
        //注意线程安全问题
        while (true){
//            注意锁对象唯一
            synchronized (gift ){
                if (gift.size() < 10){
                    break;
                }
                String good = gift.remove(random.nextInt(gift.size()));
                System.out.println(name + "发放了"+ good);
                //记录发放次数
                count++;
            }


        }

    }
}
