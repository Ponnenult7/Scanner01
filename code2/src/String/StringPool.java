package String;
/*
字符串常量池：程序中直接写上的双引号字符串就在字符串常量池当中 new的不在常量池当中
对于基本类型来说 == 是进行数值的比较
对于引用类型来说 == 是进行地址值的比较

 */
public class StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
    }
}