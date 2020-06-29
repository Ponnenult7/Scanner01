package String;
/*
String当中与转换相关的常用方法
public char[] toCharArray[]:将当前字符串拆分为字符数组作为返回值
public byte[] getBytes()：获得当前字符串底层的字节数组
public String replace(CharSequence oldString,charSequence newString):
将所有出现的老字符串替换成新的字符串 返回替换之后的结果新字符串
备注：CharSequence意思就是说可以接收字符串类型
 */
public class StringConvert {
    public static void main(String[] args) {
        //转换为字符数组
        char[] charArray = "Hello".toCharArray();
        System.out.println(charArray[1]);
        System.out.println(charArray.length);


        //转化为字节数组
        byte[] byteArray = "abc".getBytes();
        System.out.println(byteArray[1]);
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }
        System.out.println("==============");

        //字符串的内容替换
        String str1 = "How do you do ?";
         String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("========================");

        String lang1 = "nmsl,nmsl,nmsl,nmsl";
        String lang2 = lang1.replace("nmsl","****");
        System.out.println(lang2);

    }
}
