package Array;
/*
方法就是若干语句的功能集合。
方法好比是一个工厂。
蒙牛工厂     原料：奶牛，饲料，水
            产出物：奶制品

钢铁工厂     原料：铁矿石 煤炭 水
            产出物:钢铁建材

参数(原料)：就是进入方法的数据
返回值(产出物)：就是从方法中出来的数据

定义方法的完整格式(现阶段)：
修饰符 返回值类型 方法名称(参数类型 参数名称,...){
       方法体
       return 返回值;
       }

修饰符 ：现阶段的固定写法, public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：方法名字 驼峰
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据对应的变量名称
PS：参数如果有多个，使用逗号进行分隔
方法体：方法需要做的事情；若干行代码
return ：两个作用，第一停止当前方法, 第二将后面的结果数据返回值还给调用处
返回值: 也就是方法执行后最终产生的数据结果

return后面的返回值必须和方法名称前面的返回值类型保持对应

定义一个两个int数字相加的方法。三要素：
返回值类型：int
方法名称: sumInt
参数列表：int a,int b;

方法的三种调用格式：
1.单独调用：方法名称(参数);
2.打印调用：System.out.println(方法名称(参数));
3.赋值调用：数据类型 变量名称 = 方法名称(参数);

注意：返回值类型固定写为void,这种方法只能够单独调用,不能进行打印调用或者赋值调用.
 */
public class MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sumInt(10,20);
        System.out.println("=============");

        //打印调用
        System.out.println(sumInt(10,20));
        System.out.println("=============");

        //赋值调用
        int num = sumInt(15,25);
        num += 100;
        System.out.println("变量的值：" + num);

    }
    public static int sumInt(int a,int b){
        System.out.println("方法已经执行!");
        int result = a + b ;
        return result ;

    }
}
