package Static;
/*
一旦使用static修饰成员方法 那么就成为了静态方法 静态方法不属于对象 而是属于类的
如果没有static关键字 那么必须首先创造对象 通过对象才能使用它
如果有了static关键字 那么不需要创建对象 直接就能通过类名称来使用它

无论是成员变量还是成员方法 如果有了static 都推荐使用类名称进行调用
静态变量： 类名称.静态变量
静态方法： 类名称。静态方法()

注意事项:
1.静态不能直接访问非静态
原因：因为在内存当中先有的静态内容 后有的非静态内容
2.静态方法当中不能用this
原因：this代表当前对象 通过谁调用的方法 谁就是当前对象
 */
public class StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创造对象
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法来说 可以通过对象名进行调用 也可以直接通过类名称来调用
        obj.methodStatic();//正确 不推荐  该写法在编译之后也会被javac翻译成为“类名称.静态方法名”
        MyClass.methodStatic();//正确 推荐

        myMethod();//对于本类当中的静态方法 可以省略类名称
        StaticMethod.myMethod();//完全和上面等效
    }

    public static void myMethod(){
        System.out.println("这是我自己的方法！");
    }
}
