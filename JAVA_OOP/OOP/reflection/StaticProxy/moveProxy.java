package OOP.reflection.StaticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class moveProxy {


    interface Human{
        void belifve(String high);
        String run();
    }


//        动态代理

    /**
     * 要想实现动态代理，需要解决的问题?
     * 问题一:如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。
     * 问题二:当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
     */
        class Factory{
            public static Object porxy(Object obj) {//obj被代理对象
                MyInvocationHandler handler = new MyInvocationHandler();
                handler.bind(obj);
                return Proxy.newProxyInstance(Super.class.getClassLoader(), obj.getClass().getInterfaces(), handler);
            }

            }

             static class MyInvocationHandler implements InvocationHandler{

                private Object obj; //需要使用被代理对象赋值
                public void  bind(Object obj){
                    this.obj =  obj;
                }

                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    return method.invoke(obj,args);
                }
            }

    public static void main(String[] args) {
        Super aSuper = new Super();
        Human porxy = (Human)Factory.porxy(aSuper);
        String run = porxy.run();
        System.out.println(run);
        porxy.belifve("高高高");


    }


}
