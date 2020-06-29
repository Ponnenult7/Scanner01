package Object;
/*
当方法的局部变量和类的成员变量重名的时候 根据“就近原则” 优先使用局部变量
如果需要访问本类当中的成员变量 需要使用格式：
this.成员变量名

"通过谁调用的方法 谁就是this"
 */
public class thisPerson01 {
    String name;//本人名字

    public void sayHello(String name){//打招呼的人的名字

        System.out.println(name + "你好, 我是" + this.name);
        System.out.println(this);
    }
}
