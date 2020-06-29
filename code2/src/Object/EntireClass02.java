package Object;

public class EntireClass02 {
    public static void main(String[] args) {

        EntireClass01 stu1 = new EntireClass01();

        stu1.setName("张三");
        stu1.setAge(17);
        System.out.println("姓名：" + stu1.getName() + " 年龄: " + stu1.getAge());
        System.out.println("===================");

        EntireClass01 stu2 = new EntireClass01("克里斯",17);
        System.out.println("姓名：" + stu2.getName() + " 年龄: " + stu2.getAge());
        System.out.println("===================");

        stu2.setAge(20);
        stu2.setName("王二麻子");
        System.out.println("姓名：" + stu2.getName() + " 年龄: " + stu2.getAge());



    }
}
