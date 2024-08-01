package OOP.Inner;

import java.util.Comparator;

public class nMclass {

    public void AA(){
//        局部类
        class BB{

        }
    }

//    实际开发中，实现内部类方法
//    方法一
//    public Comparator getComparator(){
//        //创建实现Comparator接口的类：局部内部类
//        class MyComparator implements Comparator{
//
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//
//        }
//        return  new MyComparator();
//    }

//    方法二：匿名内部类写法
    public Comparator MyComparator(){

//        return new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        };
        return   (Object o1,Object o2)  -> 0;
    }

}
