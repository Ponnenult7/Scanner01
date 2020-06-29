package Arrays;

import java.util.Arrays;

/*
使用Arrays相关API 将一个随机字符串中的所有字符升序排列 并倒序打印
 */
public class ArraysReverse {
    public static void main(String[] args) {
        //随机字符串
        String str = "Mayday";

        //字符串变数组 toCharArray
        char[] array = str.toCharArray();

        //升序排列 Arrays.sort
        Arrays.sort(array);


        //倒序遍历
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
