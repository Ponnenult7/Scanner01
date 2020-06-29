package Object;

public class Phone01 {
    public static void main(String[] args) {
        //根据Phone创建一个名为iPhone的对象

        //格式 类名称 对象名 = new 类名称();
        Phone iPhone  = new Phone();

        //使用成员变量
        //输出类名称
        System.out.println(iPhone.brand);//null
        System.out.println(iPhone.price);//0.0
        System.out.println(iPhone.color);//null
        System.out.println("=================");

        iPhone.brand = "iPhone11 pro max";
        iPhone.price = 12999.9;
        iPhone.color = "银灰色";

        System.out.println(iPhone.brand);
        System.out.println(iPhone.price);
        System.out.println(iPhone.color);

        System.out.println("=================");

        iPhone.call("Stephen Jobs");
        iPhone.sendMessage();
        iPhone.takePhoto(7);


    }

}
