package Extends01;
/*
继承是多态的前提
继承主要解决的问题就是： 共性抽取
继承关系当中的特点
1.子类可以拥有父类的“内容”
2.子类还可以拥有自己专有的内容

在继承的关系当中：“子系就是一个父类” 也就是说 子类可以当作父类看待
例如 父类是员工 子类是讲师 那么讲师就是一个员工 关系：is-a

定义父类的格式(一个普通的类定义)
public class 父类名称{
      //...
}

定义子类格式：
public class 子类名称 extends 父类名称{
      //...
}
 */
public class Extends01 {
    public static void main(String[] args) {
        //创建了一个子类对象
        Teacher teacher = new Teacher();

        //Teacher中虽然什么都没写 但是继承了父类Employee中的method方法
        teacher.method();

        //创建另一个子类 主教
        Assistant assistant = new Assistant();
        assistant.method();

    }
}
