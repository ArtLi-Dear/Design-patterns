package OOP;

/**
 * 构造器：
 * 如果没有显示的定义类的构造器的话，系统则默认提供空参构造器
 * 定义构造器的格式，权限修饰符 类名（形参列表）{}
 * 一个类中有多个构造器彼此构成重载
 * 一旦定义显式构造器，系统就不会提供无参构造器
 */
public class Consturcter {


    String name;
    int age;
    public Consturcter(){
        System.out.println("我是无参构造器");
    }
public Consturcter(String n,int a){
        name =n;
        age  =a;
        System.out.println("我是有参构造器");
    }


    public static void main(String[] args) {

        Consturcter person = new Consturcter("da",1);
        Consturcter person1 = new Consturcter();


    }




}
