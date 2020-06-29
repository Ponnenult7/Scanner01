package Scanner;

import java.util.Scanner;

/*
键盘输入三个字
求出最大值
 */
public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字！");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字！");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字！");
        int c = sc.nextInt();

       /*
        if (a>b&&a>c){
            System.out.println("最大值为：" + a);
        }else if(b>a&&b>c){
            System.out.println("最大值为：" + b);

        }else {
            System.out.println("最大值为：" + c);
        }
        */
       int temp = a > b ? a : b;
       int max = temp > c ? temp : c;
        System.out.println("最大值为：" + max);
    }

}
