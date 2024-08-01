package OOP;

/**
 * 单例模式：
 * 每个类只能存在一个对象实例，
 * 必须将构造器访问权限设置private通过该类的方法返回内部创建的对象
 *
 * 饿汉单例模式
 *在创建类创建时创建对象：一开始就创建好对象
 */
public class Singleton {

    //2.内部类创建对象
    private static   Singleton instance = new Singleton();

    //3.内部方法访问，返回对象
    public static   Singleton  getInstance(){
        return instance;
    }

//    1.私有化构造器
    private Singleton(){

    }





}
