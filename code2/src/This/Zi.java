package This;
/*
super关键字用来访问父类内容 而this关键字用来访问本类内容 用法也有三种
1.在本类的成员方法中 访问本类的成员变量
2.在本类的成员方法中 访问本类的另一个成员方法
3.在本类的构造方法中 访问本类的另一个构造方法
在第三种调用方法中也要注意 this(...)也要是第一个语句
 */
public class Zi extends Fu {
     int num = 20 ;

     public Zi(){
         this(123);//本类的无参构造 调用本类的有参构造
     }

     public Zi(int n){

     }

     public Zi(int n,int m){

     }
    public void method(){
        int num = 10 ;
        System.out.println(num);//本类当中的局部变量
        System.out.println(this.num);//本类当中的成员变量
        System.out.println(super.num);//父类当中的成员变量

    }

    public void methodA(){
        System.out.println("AAA");
    }

    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
}
