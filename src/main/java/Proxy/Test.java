package Proxy;

import Proxy.train.ProxyUtil;
import Proxy.train.UserService;
import Proxy.train.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
//       Star star = new Star("杨超越");
//
//        bigstar proxy = ProxyUtils.createProxy(star);
//        proxy.dance();
//        String sing = proxy.sing("好日子");
//        System.out.println(sing);

        UserService proxy = ProxyUtil.createProxy(new UserServiceImpl());
        proxy.login();
        String register = proxy.register();
        System.out.println(register);

    }
}
