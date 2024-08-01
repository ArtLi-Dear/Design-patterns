package OOP.Train02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//
//        ArrayList<Student> list = new ArrayList<>();
//        for (int i =0 ; i< 20;i++){
//            Student student = new Student();
//            //[0,6]
//            student.number = (int) (Math.random() *(6+1-1) +1 );
//            //区间取随机数公式（b-a+1）+ a   [0,100]
//            student.score = (int) (Math.random() *(100-0)+1);
//            student.state = (int) (Math.random() *(100-0)+1);
//
//            list.add(student);
//        }
//
        Student1[] students = new Student1[20];
        for (int i =0;i<students.length;i++){
            //给数组元素赋值
            students[i] = new Student1();

            students[i].state = (int) (Math.random() *(6+1-1) +1 );
            students[i].number = i+1;
            students[i].score = (int) (Math.random() *(100-0)+1);
        }
        Student1 student1 = new Student1();
//        for (Student student : students) {
//
//            System.out.println(student.info());
//        }
        System.out.println("---------------------");
        //打印3年级的学生信息
//        for (int i =0; i < students.length;i++){
//            if (students[i].state == 3) {
//                System.out.println(students[i].info());
//            }
//        }
        student1.searchStudents(students,2);
        System.out.println("-----------------------");
        //中间变量

        //使用冒泡排序按学生成绩排序(升序)
        for (int i =0;i < students.length;i++){




        }


    }
}
