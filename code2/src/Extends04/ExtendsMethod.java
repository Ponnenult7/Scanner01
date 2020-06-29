package Extends04;
/*
在父子类继承关系当中 创建子类对象 访问成员方法的规则
    创建的对象是谁 就优先用谁 如果没有则向上找

注意事项：
无论是成员方法还是成员变量 如果没有都是向上找 不会向下找子类

重写(Override)
概念： 在继承概念当中 方法的名称一样 参数列表也一样

重写(Override):方法的名称一样 参数列表也一样 也叫做 覆盖,复写
重载(OverLoad):方法的名称一样 参数列表不一样

方法的覆盖重写特点 创建的是子类对象 则优先使用子类方法
 */
public class ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        //new了的是子类对象 所以优先使用子类方法
        zi.method();
    }
}
