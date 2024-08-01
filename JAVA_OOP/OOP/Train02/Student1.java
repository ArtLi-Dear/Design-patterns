package OOP.Train02;

//改进，封装方法
public class Student1 {

    int number;
    int state;
    int score;

    public String info(){
        return "学号:" + number+"年级" +state+"成绩" +score ;
    }

    /**
     * 根据年级查询学生信息
     * @param stu 学生列表
     * @param state 年级
     */
    public void searchStudents(Student1  stu[],int state){
        for (int i =0; i < stu.length;i++){
            if (stu[i].state == state) {
                System.out.println(stu[i].info());
            }
        }
    }
}


