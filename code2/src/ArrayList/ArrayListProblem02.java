package ArrayList;

import java.util.ArrayList;

/*
自定义4个学生对象 添加到集合 并遍历
 */
public class ArrayListProblem02 {

    public static void main(String[] args) {

        Student stu01 = new Student("赵二",17);
        Student stu02 = new Student("张三",18);
        Student stu03 = new Student("李四",19);
        Student stu04 = new Student("王五",20);

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu01);
        list.add(stu02);
        list.add(stu03);
        list.add(stu04);

        for (int i = 0; i < list.size(); i++) {
            Student stu  = list.get(i);
            System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge());
        }
    }
}
