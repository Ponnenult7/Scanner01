package String;
/*
定义一个方法 把数组[1,2,3]按照指定格式拼接成一个字符串 格式参照如下：
[word1#word2#word3]
思路 定义一个方法 将数组变成字符串
三要素
返回值类型 String
方法名称 getStringFromArray
参数列表 int[]
 */
public class StringProblem01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String result = getStringFromArray(array);
        System.out.println(result);

    }
    public static String getStringFromArray(int[] array) {
        String str = "[";

        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {

                str += "word" + array[i] + "]";

            }else{

                str += "word" + array[1] + "#";
            }
        }
        return str;
    }
}
