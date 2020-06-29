package Array;
/*
方法有参数：小括号当中有内容. 当一个方法需要一些数据条件才能完成任务的时候,就是有参数.
           例如两个数字相加,必须知道两个数字各是多少,才能相加.
方法没有参数：小括号当中留空.一个方法不需要任何数据条件,自己就能独立完成任务,就是无参数.
             例如定义一个方法，打印固定十次helloworld.
 */
public class MethodDefine02 {
    public static void main(String[] args) {
        Method1(10,20);
        Method2();
    }
    //两个数字相乘,必须知道两个数字各是多少，否则无法进行计算
    //有参数,参数就是各自等于几。
    public static void Method1(int a,int b){
        int  result = a * b ;
        System.out.println("结果是 " + result);
    }

    //无参数
    //例如固定打印是10次文本字符串
    public static void Method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!" + i);
        }
    }
}
