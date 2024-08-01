package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class traning {
    public static void main(String[] args) {
//        定义集合
//        过滤奇数,只留下偶数并保存
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,312,43,5,3,54,64);
       list.stream()
                .filter(l -> l % 2 == 0)
                .forEach(System.out::println);

        IntStream intStream = IntStream.of(1, 3, 3, 4, 5);
//        findFirst返回符合条件的第一个数
//        System.out.println(intStream.filter(s ->s % 2 == 0).findFirst().orElse(-1));
        //    findAny找到任意一个元素，在串行流中与first类似，在并行流中就有区别
        intStream.filter( s -> s %2 ==0 ).findAny().ifPresent((s) -> System.out.println(s) );



        /**
         * 排序
         */
//    Sort方法
        Stream.of(
                new Hero("李白",79),
                new Hero("来宾",84),
                new Hero("王伟",69),
                new Hero("鲤鱼",99)
//                    当a武力值值小于b，就升序
          )
//                .sorted((a,b) ->a.power() < b.power()?-1 :a.power() == b.power()?0:1).forEach(System.out::println);
//简化
//                .sorted((a,b)-> Integer.compare(a.power(), b.power())).forEach(System.out::println);
//                最终表示，结果为升序
//                .sorted(Comparator.comparing(Hero::power)).forEach(System.out::println);
//                如果想做降序可以使用Comparator中reversed()方法，改变原有次序
//        thenComparing在某值相等的时候比较其他条件
//                当前是当武力值相等时比较名字长度
                .sorted(Comparator.comparing(Hero::power).reversed().thenComparing(s -> s.name().length()))
                .forEach(System.out::println);

        System.out.println("------------------------------------------");
        /**
         * 练习二
         * 创建一个ArrayList集合，并添加以下字符串，前面姓名后面是年龄
         * 保留年龄大于等于24岁，并将结果收集到Map，姓名为键，年龄为值
         */
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings,"张三,23","李四,24","王五,25");
        Map<String, Integer> map = strings.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])));

        System.out.println("收集到的map集合为"+map);


        /**
         * 练习三
         现在有两个ArrayList集合
         要求完成如下的操作：
         1.男演员只要名字为3个字的前两人
         2.女演员只要姓杨的，并且不要第一个
         3.把过滤后的男演员与女演员姓名合并一起
         4.将上一步的演员姓名对象保存到List集合。
         5.将所有的演员对象保存到List集合中
         备注：演员类Actor，属性有：name，age

         */
//    1.创建两个list集合
        ArrayList<String> man = new ArrayList<>();
        Collections.addAll(man,"cxk,24","yhx,23","lbt,22","wq,24","gj,30");
        ArrayList<String> woman = new ArrayList<>();
        Collections.addAll(woman,"zxx,35","yy,36","gyy,43","wz,35","yxm,33");

        Stream<String> limit = man.stream()
                .filter(m -> m.split(",")[0].length() == 3)
                .limit(2);

        Stream<String> y = woman.stream()
                .filter(w -> w.split(",")[0].startsWith("y"))
                .skip(1);
//转换成对象
        Stream.concat(limit,y).map(s ->{
           String name = s.split(",")[0];
           int age = Integer.parseInt(s.split(",")[1]);


        return new Actor(name,age);}
        );
    }








    record Hero(String name,int power){

    }

}
