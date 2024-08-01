package OOP.reflection.StaticProxy;
//被代理类
public   class  Super implements moveProxy.Human {


    @Override
    public void belifve(String high) {
        System.out.println("我can--fly" + high);
    }

    @Override
    public String run() {
        System.out.println("开始run");
        return "run run run";
    }

    ;
}