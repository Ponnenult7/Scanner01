package Object;

public class PeoplePrivate02 {
    public static void main(String[] args) {
        PeoplePrivate01 Peo = new PeoplePrivate01();
        Peo.setName("张三");
        Peo.setAge(17);
        Peo.setMale(true);
        System.out.println("姓名：" + Peo.getName());
        System.out.println("年龄：" + Peo.getAge());
        System.out.println("性别：" + Peo.isMale());
    }
}
