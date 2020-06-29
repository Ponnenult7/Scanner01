package Object;

public class Person02 {
    public static void main(String[] args) {
        Person01 person = new Person01();
        person.show();

        person.name="张三";
//        person.age = -17; //直接访问private内容 是错误写法！

        person.setAge(10);
        person.show();
    }
}
