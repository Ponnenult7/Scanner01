package Array;
/*
使用动态初始化一个数组时 其中的元素会自动拥有一个默认值。规则如下:
    如果是整数类型 那么默认值为0
    如果是浮点数类型 那么默认为0.0
    如果是字符类型 那么默认为'\u0000';
    如果是boolean类型 那么默认为false
    如果是引用类型 那么默认为null

    注意事项:
    静态初始化也有默认值 只不过系统自动马上将默认值替换成为了大括号里的具体数值
 */
public class ArrayUse02 {
    public static void main(String[] args) {

        //动态初始化一个数组
        int[] array = new int[3];
        System.out.println(array);//内存地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("=========");

        //将数值123赋值给数组array中的1号元素
        array[1] = 123;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
