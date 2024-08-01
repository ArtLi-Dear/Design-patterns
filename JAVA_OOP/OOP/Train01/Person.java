package OOP.Train01;

public class Person {
    String name ;
    int age=10;
    String sex;


    public void study(){
        System.out.println("studying");
    }
    public void  showAge(){
        System.out.println(age);
    }
    public int addAge(int i ){

        return  age+=i;
    }
}
