package Random;
/*
要求
根据int变量n的值来获取随机变量 范围是[1,n] 可以获取到1也可以获取到n
 */
import java.util.Random;


public class Random03 {
    public static void main(String[] args) {
        int num = 5;

        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            //原本范围是[0,n) 整体加一之后变成了[1,n+1) 也就是[1,n]
            //num不能写在括号外面
            int result = r.nextInt(num)+1;

            System.out.println(result);
        }



    }
}
