package Multithread.Hband;

public class Change extends Thread{

    private User user;

    public  Change(User user,String name){
//        父类方法中有设置名称的这个方法
        super(name);
        this.user = user;

    }

    @Override
    public void run() {
        user.memoly(6000);

    }
}
