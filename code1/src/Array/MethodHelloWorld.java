package Array;
/*
题目要求 定义一个方法 用来打印指定次数的HelloWorld!

 */
public class MethodHelloWorld {
    public static void main(String[] args) {
        printCount(5);
    }
    /*
      三要素
      返回值类型：进行多次打印 没有计算 也没有计算结果告诉调用处
      方法名称：printCount
      参数列表：要打印多少次 必须告诉我 否则没法打印 次数 int
     */
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World!" + (i+1));
        }
    }
}
