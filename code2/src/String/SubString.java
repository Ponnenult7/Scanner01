package String;
/*
字符串的截取方法：
public String substring(int index):从参数位置一直到字符串末尾 返回新字符串
public String substring(int begin,int end) 截取一个范围 从begin开始一直到end结束
中间的字符串
备注：[begin,end)
 */
public class SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.substring(4,7);
        System.out.println(str3);

        /*下面的这段代码字符串的内容仍然没有改变 两个字符串分别为Hello和Java
        strA中保存的是地址值 比如原本的地址值是Hello的0x123 后来地址值变成了
        Java的0x456

         */
        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//java
    }
}
