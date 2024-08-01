package OOP;

/**
 * static关键字使用：
 *
 *1.静态的
 * 2.可以用来修饰：属性、方法、代码块、内部类
 *
 * 3.用来修饰属性：静态变量
 *          属性：是否使用static修饰，分为：静态实例 和 非静态（实例变量）
 *          实例变量：每个对象相互独立，不影响彼此修改属性
 *          静态变量：共享变量，其他对象都能调用该变量进行修改，调用
 *   静态变量：随着类的加载而加载。可通过类.静态变量方式调用
 *          静态变量的加载早于对象创建
 *          由于类加载一次，所以静态变量在内存中只存在一份
 * 4.用来修饰方法属性：
 *         1.随着类的加载而加载，可通过类.静态方法方式调用
 *          2.静态方法不能调用非静态方法、属性
 *          静态方法内，不能使用this、super关键字
 *          从生命周期角度理解
 *
 * 什么时候声明static？
 * 需要被多个对象共享，不会随着对象的不同而不同
 *
 *
 */
public class OOP_Static {
    public static void main(String[] args) {
        China people1 = new China();
        people1.age = 43;
        people1.name = "洪总";


        China people2 = new China();
        people2.age = 33;
        people2.name = "栏总";

        China.nation = "CN";

        System.out.println(China.nation);
    }


}

class China{
    String name;
    int age;

    static String nation ;
}
