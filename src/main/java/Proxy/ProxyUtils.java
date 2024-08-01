package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyUtils {
    /**
     * 代理对象
     *
     */
/*
public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
              参数一：指定类加载器,通常用当前对象的类加载器
              参数二：生成的代理长什么样子，有哪些方法
              参数三：指定生成对象做什么事情
 */

    public  static bigstar createProxy(Star   star){

//        method代理方法做什么由invoke方法决定
        bigstar bigStar1 = (bigstar) java.lang.reflect.Proxy.newProxyInstance(ProxyUtils.class.getClassLoader()
                , new Class[]{bigstar.class}, new InvocationHandler() {
                    @Override//也是回调函数,被method调用
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            if (method.getName().equals("sing")){
                                System.out.println("准备话筒，需要1000元");
//                                return method.invoke(star,args);
                            } else if (method.getName().equals("dance")) {
                                System.out.println("准备舞台,需要100000元");
//                                return  method.invoke(star,args);
                            }
                        return method.invoke(star,args);

                    }
                });

               return bigStar1;


    }
}
