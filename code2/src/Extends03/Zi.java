package Extends03;

public class Zi extends Fu{
    int num = 20;

    public void method(){
        int num = 30;
        System.out.println(num);//30
        System.out.println(this.num);//20 本类的成员变量
        System.out.println(super.num);//父类的成员变量

    }
}