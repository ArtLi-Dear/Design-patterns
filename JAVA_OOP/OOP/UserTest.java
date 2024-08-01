package OOP;

/**
 * 类中属性使用
 * 成员变量  ： 局部变量
 *相同点：
 * 1.定义变量的格式：数据类型 变量名 = 值
 *  先声明后使用
 *  对应的作用域
 *
 *
 * 不同点：
 * 1.声明位置不同
 *  属性直接定义在类{}中
 *  局部变量声明在方法内，方法形参，构造器形参代码块内、构造器内部变量
 *2.权限修饰符
 *  属性：可以声明属性时，指明其权限：private、public
 *  局部变量： 不可以使用
 * 3.初始化
 *  属性：基本数据类型 为 0 ，引用数据类型 为null ，Boolean 为false
 *  局部变量：没有默认初始值，需要显式赋值或调用时赋值
 *4.内存加载位置
 *  成员变量：加载到堆空间（非static）
 *  局部变量：加载到栈空间
 *
 */
public class UserTest {
    public static void main(String[] args) {

    }
}

class User{
    //属性：成员变量
    String name;
    int age;


    public void eat(String food){//局部变量
        System.out.println("爱吃"+ food);
    }

    public void  sing(){
        String name = "儿歌";//局部变量
        System.out.println("喜欢唱"+name);
    }
}
