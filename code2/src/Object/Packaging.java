package Object;
/*
1.方法就是一种封装
2.关键字private也是一种封装

封装就是将一些详细信息隐藏起来 对于外界不可见
 */
public class Packaging {
    public static void main(String[] args) {
        int[] array = {5,15,25,35,45,100};
        int max = getMax(array);
        System.out.println(max);

    }

    //给我一个数组 我给你一个数组最大值
    public static int getMax(int[] array){

        int max = array[0];

        for (int i = 1;i<array.length;i++){

            if(array[i] > max){

                max = array[i];
            }
        }
        return max;
    }
}
