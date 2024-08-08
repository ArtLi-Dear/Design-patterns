package MyArrary;


import java.util.Scanner;

/**
 * 数组模拟队列
 */
public class ArrayQueue {
    public static void main(String[] args) {
        //对象实例化
        Queue queue = new Queue(3);
        //记录终端输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //菜单
        while (loop){
            System.out.println("--------------------");
            System.out.println("欢迎来到数组队列模拟");
            System.out.println("--------------------");
            System.out.println("1.输入'a',向队列添加数据");
            System.out.println("2.输入'b',获取队列数据");
            System.out.println("3.输入'c',查看队列所有数据");
            System.out.println("4.输入'd',获取队列头数据");

            //记录输入的字符
            String key = scanner.next();
            switch(key){
                case "a":

                    int i = scanner.nextInt();
                    queue.add(i);
                   break;
                case "c":
                    //展示队列数据
                    queue.list();
                    break;
                case "b":
                    try {
                        int queueQueue = queue.getQueue();
                        System.out.println("获取队列数据a"+queueQueue);

                    } catch (Exception e) {
                        throw new RuntimeException(e.getMessage());
                    }
                    break;
                case "d":
                    try {
                        int head = queue.head();
                        System.out.println("队列头数据："+head);
                    } catch (Exception e) {
                        throw new RuntimeException(e.getMessage());
                    }
                    break;
                case "e":
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;

            }
            System.out.println("程序退出");
        }


    }
}

//编写队列类
class Queue{
    private int maxSize; //表示数组最大容量
    private int front; //队列头
    private int rear; //队列尾
    private int[] arr; //用于存放数据，模拟队列

    public Queue(int arrMaxsize){
        maxSize = arrMaxsize;
        front = -1;  //指向队列头部，分析出front是指向队列头的前一个位置
        rear = -1; //指向队列尾，指向队列尾部的数据（包括最后一条数据）
        arr = new int[arrMaxsize];
    }
    //队列是否已满
    public boolean isFull(){
        return rear == maxSize -1;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }

//    往队列添加数据
    public void add(int n){
        //判断队列是否已满
        if (isFull()) {
            System.out.println("队列已满~~");
            return;
        }
        rear++;//rear后移
        arr[rear] = n;

    }
//        获取队列数据(出队列)
    public int getQueue(){
        if (isEmpty()) {
           throw  new RuntimeException("队列为空！");
        }
        //front指向的是队列头的前一个位置
        //向后移一位才是头数据
        front++;

        return arr[front];
    }

    //显示队列数据
    public void list(){
        if (isEmpty()) {
            System.out.println("队列为空！");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //显示队列头数据
    public int head(){
        if (isEmpty()) {
            throw  new RuntimeException("无数据");
        }
        return arr[++front];
    }
}