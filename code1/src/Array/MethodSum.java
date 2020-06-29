package Array;
/*
题目要求：定义一个方法 求出1到100之间所有数字之和
 */
public class MethodSum {
    public static void main(String[] args) {

        System.out.println("结果是 "+ sumInt());
    }
    /*
    三要素：
    返回值类型：int
    方法名称：sumInt
    参数列表：数据范围已经确定 是固定的 不需要告诉任何条件 不需要参数
     */
    public static int sumInt(){
       int sum = 0;
       for (int i = 1;i<=100;i++){
           sum+=i;

       }
       return sum;
    }
}
