package Array;
/*
一个方法可以有0,1,多个参数,但是只能有0或者一个返回值
如果希望一个方法当中产生了多个返回值怎么办？
解决方案：使用一个数组作为返回值类型即可

数组作为方法的参数 传递出去的其实是数组的地址值
数组作为方法的返回值 返回的其实也是数组的地址值
 */
public class ArrayMethod02 {
    public static void main(String[] args) {

        int[] result = caculate(10,20,30);

        System.out.println("main方法接收到的返回值是：");
        System.out.println(result);//地址值

        System.out.println("总和 " + result[0]);
        System.out.println("平均数 " + result[1]);

    }
    public static int[]  caculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum/3;

       /*
       int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        */
       int[] array = {sum,avg};

        System.out.println("caculate方法内部数组是：");

        System.out.println(array);//地址值

        return array;
    }
}
