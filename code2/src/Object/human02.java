package Object;

public class human02 {
    public static void main(String[] args) {

        human hum01 = new human();
        System.out.println("===================");

        human hum02 = new human("张三",20);
        System.out.println("姓名：" + hum02.getName()+ " 年龄：" + hum02.getAge());
        //如果需要改变对象当中的成员变量 仍然需要使用setXxx方法
        hum02.setAge(21);
        System.out.println("姓名：" + hum02.getName()+ " 年龄：" + hum02.getAge());
    }
}
