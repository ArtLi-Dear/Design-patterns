package OOP;

/**
 * 懒汉单例模式
 * 什么时候用什么时候造
 *
 * 区分懒汉和饿汉式：
 *      饿汉式：对象加载时间过长，但是线程安全
 *
 *      懒汉式：延迟对象创建，目前线程不安全，但能进行线程安全改造
 */
public class Singletonlan {

    public static void main(String[] args) {
        Singletlan instance = Singletlan.getInstance();
        Singletlan instance1 = Singletlan.getInstance();
        System.out.println(instance1 == instance);
    }
}
class Singletlan{
//    1.私有化构造器
    private Singletlan(){

    }
//    2.内部类声明对象
    private static Singletlan   instance= null;

//    3.在方法中，创建对象
    //并且条件判断创建对象是否为空，为空才创建
    public  static synchronized Singletlan getInstance(){
        if (Singletlan.instance == null) {
            instance = new Singletlan();

        }
    return instance;
    }

}
