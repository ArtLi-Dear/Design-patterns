package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"夏明","雪花","伯纳德","阿张","阿大");

//        Stream流的中间方法
        /**
         * filter 过滤
         * limit 获取前几个数据
         * skip跳过前几个元素
         * distinct 元素去重依赖（hashcode和equals方法）
         * concat 合并两个流，最好数据类型保持一致
         * map转换流中的数据类型
         *
         * 注意：中间方法，返回新的流，原来的流只能使用一次
         * 修改流中的数据，不会影响原来数组和集合中的数据
         */
//        练习输出"阿张","阿大"
        list.stream().skip(3).forEach(l -> System.out.println(l));


        /**
         * Stream流的终结方法
         * forEach  遍历
         *count    统计
         * toArray（）  收集流中数据放到数组
         * collect      收集流中的数据放到集合
         */
    }
}
