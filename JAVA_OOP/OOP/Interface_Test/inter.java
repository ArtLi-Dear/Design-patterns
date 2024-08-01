package OOP.Interface_Test;


/**
 * 接口的使用：
 * 1.接口使用interface定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口，定义接口中的成员
 *
 *      3.1、JDK7:只能定义全局常量和抽象方法
 *          >全局常量：public static  final的
 *          >抽象方法：public abstract的
 *
 *          接口中不能创建构造器，所以实例化不能实例化
 *
 *      3.2、JDK8：接口通过让类去实现（implements）的方式来使用
 *          如果实现类覆盖了接口的所有抽象方法，则实现类就可以实例化
 *          如果实现类没有覆盖接口的所有抽象方法，则此类就仍为抽象类
 *
 *
 */
public class inter {
    public static void main(String[] args) {
        System.out.println(Fly.MAX_SPEED);
//        Fly.MIN_SPEED = 2;
    }
}
interface Fly{
    //全局常量
    public   static  final  int MAX_SPEED = 1999;
    int MIN_SPEED = 1; // 省略了（ public   static  final ）

    //抽象方法
    public abstract void  fly();

    //省略了  public abstract
    void  fly2();

}

abstract class Plane implements Fly {

    @Override
    public void fly() {

    }
}
    class Plane1 implements Fly{

        @Override
        public void fly() {

        }

        @Override
        public void fly2() {

        }
    }
