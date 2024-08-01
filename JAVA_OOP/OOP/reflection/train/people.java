package OOP.reflection.train;


import org.testng.annotations.Test;


public class people {



    /**
     * 1.类的加载过程:
     * 程序经过iavac.exe命令以后，会生成一个或多个字节码文件(.class结尾)。
     * 接着我们使用iava.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。
     * 此过程就称为类的加载。加载到内存中的类，我们就称为运行时类，此运行时类，就作为class的一个实例。
     * 2.换句话说，Class的实例就对应着一个运行时类。
     *
     */
    @Test
    public void test() throws ClassNotFoundException {
//        获取Class实例
        //方式一：调用运行时类的属性
        Class<Po> poClass = Po.class;
        //方式二：通过运行时的对象,调用getClass
        Po po = new Po();
        Class cl = po.getClass();
        //方式三： forName
        Class<?> aClass1 = Class.forName("OOP.reflection.train.Po");


        //方式四：使用类加载器
        ClassLoader classLoader = people.class.getClassLoader();
        Class<?> aClass = classLoader.loadClass("OOP.reflection.train.Po");
        System.out.println(aClass == poClass);
        System.out.println(aClass == cl);
        System.out.println(poClass == aClass1);

    }


}
