package Proxy;

/**
 * 代理对象
 */
public class Star implements bigstar {
    public Star(String name) {
        this.name = name;
    }

    private String name;

    public String sing(String name){
        System.out.println(this.name + "正在唱歌---" +name);

        return "谢谢!";
    }

    public void  dance(){
        System.out.println(this.name + "跳舞!");
    }

}
