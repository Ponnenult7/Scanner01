package String;

import java.util.Scanner;
import java.util.zip.ZipEntry;

/*
键盘输入一个字符串 并且统计其中各种字符出现的次数
种类有: 大写字母 小写字母 数字 其它
 */
public class StringProblem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串！");
        String input = sc.next();

        //定义四个变量 表示四种种类出现的次数

        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countNum = 0;//数字
        int countOther = 0;//其它

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {

            char ch = charArray[i];//当前单个字符
            if ('A'<=ch&&ch<='Z'){
                countUpper++;
            }else if ('a'<=ch&&ch<='z'){
                countLower++;
            }else if ('0'<=ch&&ch<='9'){
                countNum++;
            }else{
                countOther++;
            }
        }

        System.out.println("大写字母有：" + countUpper + "个");
        System.out.println("小写字母有：" + countLower + "个");
        System.out.println("数字字符有：" + countNum + "个");
        System.out.println("其它字符有：" + countOther + "个");

    }
}
