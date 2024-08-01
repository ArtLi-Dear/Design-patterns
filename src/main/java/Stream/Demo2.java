package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings,"张无集-15-男","周若子-21-女","赵敏-45-女","张强-35-男","张三丰-18-男","张春雨-66-男","张良-23-女");


//        void forEach(Consumer action) 遍历
//        Consumer泛型：表示流中的数据类型
//        accept方法的形参：依次表示流里的每一个数据
//        strings.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        strings.stream()
                .forEach(s -> System.out.println(s));


//        toMap
        /**
         * 转换成Map类型
         * 参数一:表示键生成规则
         * 参数二:表示值的生成规则
         *
         * 参数一:
         *  Function:泛型一:表示流中的每一个数据的类型
         *          泛型二:表示Map集合中键的数据类型
         *
         *          方法apply形参:依次表示流里面的每一个数据
         *          方法体:生成键的代码
         *          返回值:已经生成的键
         *
         *  Function:泛型二:表示流中的每一个数据的类型
             泛型二:表示Map集合中键的数据类型
         *          方法apply形参:依次表示流里面的每一个数据
         *               方法体:生成值的代码
         *                返回值:已经生成的值
         */
//        Map<String, Integer> map = strings.stream().filter(s -> "男".equals(s.split("-")[2])).collect(Collectors.toMap(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
////        对应的map的键
//                return s.split("-")[0];
//            }
//        }, new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s.split("-")[1]);
//            }
//        }));
//        System.out.println(map);

//        修改成lamda表达式
        Map<String, Integer> map = strings.stream()
                .filter(s -> "男".equals(s.split("-")[2]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[1])
                        ));
        System.out.println(map);
    }
}
