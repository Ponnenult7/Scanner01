package Static;
/*
如果一个成员变量使用了static关键字 那么这个变量不再属于对象自己 而是属于所在类 多个对象共享同一份数据

 */
public class staticField {
    public static void main(String[] args) {


        Student stu2 = new Student("李四",17);
        stu2.room = "857教室";
        System.out.println("姓名 " + stu2.getName() + " 年龄是" + stu2.getAge()
                + " 教室是 " +stu2.room + " 学号是" + stu2.getId());

        Student stu1 = new Student("张三",17);

        System.out.println("姓名 " + stu1.getName() + " 年龄是" + stu1.getAge()
                + " 教室是 " +stu1.room + " 学号是" + stu1.getId());
    }
}
