package Array;
/*
数组元素的反转：
本来的样子：{1,2,3,4}
反转之后：{4,3,2,1}
不能使用新数组,就用原来的唯一数组
 */
public class ArrayReverse {

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};
        //遍历打印数组本来的样子
        for (int i=0 ;i< array.length;i++) {
            System.out.println(array[i]);

        }
        System.out.println("===========");

        for (int min=0,max=array.length-1;min<max;min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
