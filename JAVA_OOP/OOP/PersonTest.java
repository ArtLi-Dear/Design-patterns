package OOP;

/**
 * 属性 = 成员变量 = 域
 * 方法 = 成员方法 = 函数
 *
 */

/**
 * 类和对象的使用
 * 1.创建类、设计类的成员
 * 2.创建类的对象
 * 3.调用
 */

/**
 * 内存对象解析
 * 堆：主要存放对象实例
 * 栈：存放局部变量
 * 方法区：被虚拟机加载的类信息、常量、静态变量、编译后代码
 *
 */
//类测试
public class PersonTest {
    public static void main(String[] args) {
        //创建类对象 = 类实例化
        Person person = new Person();
//        对象赋值
        person.name = "李浩";
        person.sex = " 男";
        System.out.println(person);
        System.out.println(person.name + person.sex);
//        调用方法：类.方法
        person.eat();
        person.sleep("优美的");

        //  不同对象，都有自己独立的一套类的属性。
        Person person1 = new Person();
        System.out.println(person1);

        //p1将对象地址赋值给p3，这时他们指向同一个对象实体，所以能够修改p1对象的属性，方法
        Person person3 = person1;
        person3.name= "小红";
        System.out.println(person1.name);
    }
}

class Person{
    //属性
    String name ;
    int age = 12;
    String sex ;

    //方法
    public void eat(){
        System.out.println("吃饭!");
    }

    public  void  dance(){
        System.out.println("跳舞");
    }

    public void sleep(String word){
        System.out.println("睡觉"+ word);
    }

}


