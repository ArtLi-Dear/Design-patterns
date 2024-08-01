package OOP.reflection.StaticProxy;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * 静态代理
 * 特点：代理类和被代理类编译期间已经确定
 */
public class reflect {

    interface proxy{
        void sing();
    }

    //代理类对象
    class NikeFactory implements proxy{

        private Nike nikeFactory;

        public NikeFactory(Nike nike){
            this.nikeFactory = nike;
        }
        @Override
        public void sing() {
            System.out.println("这是nike代理工厂");
            nikeFactory.sing();
            System.out.println("nike代理工厂处理中");
        }
    }
    //被代理对象
    class Nike implements  proxy{

        @Override
        public void sing() {
            System.out.println("nike已生产");
        }
    }

    @Test
    public void Tets(){

//        实例化被代理对象
        Nike nike = new Nike();
//        实例化代理对象
        NikeFactory nikeFactory = new NikeFactory(nike);

        nikeFactory.sing();

    }


}
