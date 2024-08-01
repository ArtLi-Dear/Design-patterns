package OOP.Inner;


/**
 * 内部类
 * 1.Java中允许将一个类A声明在另一个类B中，则A就是内部类，B就是外部类
 *
 * 2.内部类的分类：成员内部类（静态和非静态） ||| 局部内部类（方法内、代码块、构造器内）
 *
 * 3.成员内部类
 *  一方面，作为外部类的成员
 *      >调用外部类的结构
 *      >可以被static修饰
 *      >可以被4种不同的权限修饰
 *
 *  另一方面，作为一个类
 *      >类内可以定义属性、方法、构造器
 *      >可以被final修饰，表示此类不能被继承
 *      >可以被abstract修饰，不能被实例化
 *
 *     关注：如何实例化成员内部类
 *     如何在成员内部类区分调用外部类的结构
 *     开发局部内部类的使用
 */
public class Person {
    public static void main(String[] args) {
        //实例化成员内部类（静态）
        People.body body = new People.body();
        body.p();
//        非静态
//        1.先实例化外部类
        People people = new People();
//        2.再实例化内部类
        People.eyes eyes = people.new eyes();
        eyes.p();




    }



}
class People{

    //静态内部类
    static class body{

        public void p(){
            System.out.println("这是人的身体部位");
        }
    }
    //内部类
     class eyes{
        public void p(){
            System.out.println("这是人的眼睛");
        }
    }

    public void  study(){
        //局部内部类
        class skill{

            public void p(){
                System.out.println("这是学习的技巧");
            }
        }
    }
}