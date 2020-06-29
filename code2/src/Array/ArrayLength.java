package Array;
/*
如何获得数组长度:格式
数组名称.length
这将会得到一个int数字 代表数组的长度

数组一旦创建 程序运行期间 长度不可更改

 */
public class ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10,20,30,4124,1,312,3,123,12,3,123,12,312,3,12,3,23,12,3,123,12,3,12,312,3,12,3,123,12,3,123};

        int len = arrayB.length;
        System.out.println("数组的长度为 " + len);
        System.out.println("====================");

        int[] arrayC =new int[3];
        System.out.println(arrayC.length);
        System.out.println(arrayC);
        arrayC = new int[5];
        System.out.println(arrayC.length);
        System.out.println(arrayC);
    }
}
