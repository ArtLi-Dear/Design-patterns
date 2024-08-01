package OOP.Train01;

public class Test {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "xh";
        person1.age = 15;
        person1.sex = "男";
        person1.study();

        System.out.println(  "增加后年龄为："+ person1.addAge(2));

        Person person2 = new Person();
        person2.name = "xh";
        person2.age = 15;
        person2.sex = "男";
        person2.study();

        System.out.println(  "增加后年龄为："+ person2.addAge(2));
    }
}
