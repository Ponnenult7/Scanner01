package Object;
/*
定义一个类 用来模拟“手机”事务
属性：品牌 价格 颜色
行为：打电话 发信息 拍照

对应到类当中
成员变量：
   String brand ;
   double price ;
   String color ;
成员方法：
   public void call(String who){}
   public void sendMessage(){}
   public void takePhoto(){}
 */
public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

    //成员方法
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }

    public void takePhoto(int num){
        System.out.println("拍" + num + "张照骗");
    }
}
