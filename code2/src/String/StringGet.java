package String;
/*
String当中与获取相关的方法有：
public int length():获取字符串当中含有的字符个数 拿到字符串的长度
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串
public Char charAt(int index)：获取指定索引位置的单个字符
public int indexOf: 查找参数字符串在本字符串当中首次出现的索引位置 如果没有返回-1值
 */
public class StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "ashdjklasdjklsadascxmzxmaslkzxcnapqweriduh".length();
        System.out.println(length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("==============");

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("一号索引位置的字符是：" + ch);
        System.out.println("==============");

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果根本没有 返回-1值
        String original = "HelloWorldHelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是：" + index);

        System.out.println("HelloWorld".indexOf("abc"));
    }
}
