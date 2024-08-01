package Stream;


import org.testng.annotations.Test;

import java.util.function.Consumer;

/**
 * Lamda表达式的使用
 * 1.举例：(a,b) -> Integer.compare(a,b);
 *2.格式:
 *      ->:lambda操作符 或 箭头操作符
 *      ->:左边:lambda形参列表 （接口中抽象方法的参数列表）
 *      ->:右边：lambda体 （重写的抽象方法的方法体）
 * 3.Lambda达的使用
 *
 * 4.本质是作为接口的实例,依赖于函数式接口
 * 函数式接口:接口中只声明一个抽象方法，则接口称为函数式接口
 *
 */
public class LamdaTest {
    //格式一:无参无返回值
    @Test
    public void test(){
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("任务");
//            }
//        };
//        用lambda表达式修改
                Runnable runnable = () -> System.out.println("任务");
    }

    //格式二:有参无返回值
    @Test
    public void test1() {
//        Consumer<String> consumer = new Consumer<>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("这是"+ s);
//            }
//        };
                Consumer<String> consumer = (String s) -> System.out.println("这是" + s);
    }
//    格式三:数据类型可以省略,因为可由编译器推断得出,称为"类型判断"
    public void test3(){
//                Consumer<String> consumer = new Consumer<>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("这是"+ s);
//            }
//        };
        // Consumer<String>已经指出了数据类型
        Consumer<String> consumer = (s) -> System.out.println("这是" + s);
    }



}
