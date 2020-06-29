package ArrayList;
/*
要求定义一个数组 用来存储三个person对象

数组有一个缺点:一旦创建 程序运行期间长度不可以发生改变
 */
public class ArrayList01 {
    public static void main(String[] args) {
        //首先创建一个长度为三的数组 里面用来存放person类型的对象
        person[] array = new person[3];
        System.out.println(array[0]);

        person one = new person("张三",17);
        person two = new person("李四",18);
        person three = new person("王五",19);

        //将one当中的地址值赋值到数组的0号元素位置
        array[0]=one;
        array[1]=two;
        array[2]=three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        person per = array[0];
        System.out.println(per.getName());
    }
}
