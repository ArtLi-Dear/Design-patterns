package Proxy.train;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    /**
     * 创建代理对象
     */
    public static UserService createProxy(UserService userService){
      UserService userService1 =(UserService)  Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{UserService.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        if (method.getName().equals("login")){
                            System.out.println("---------------");
                            System.out.println("这是登录功能");
                            return  method.invoke(userService,args);
                        }else if (method.getName().equals("register")){
                            System.out.println("------------");
                            System.out.println("这是注册功能");
                            return  method.invoke(userService,args);
                        }else {
                            return null;
                        }




                    }
                });


        return userService1;
    }


}
