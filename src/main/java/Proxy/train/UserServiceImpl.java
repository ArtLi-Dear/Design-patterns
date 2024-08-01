package Proxy.train;

public class UserServiceImpl implements UserService{

    @Override
    public void login() {

        System.out.println("登录成功");


    }

    @Override
    public String register() {
        System.out.println("请注册");

        return "注册成功";
    }
}
