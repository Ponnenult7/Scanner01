package Random;
/*
用代码模拟猜数字的游戏
 */
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();

        int RandomNum =r.nextInt(1000000)+1;//[1,100]

        Scanner sc = new Scanner(System.in);


       while (true){

           System.out.println("请输入猜测数字！");
           int guessNum = sc.nextInt();

           if(guessNum>RandomNum){
               System.out.println("猜测数字大于随机数！");
           }else if (guessNum<RandomNum){
               System.out.println("猜测数字小于随机数！");
           }else {
               System.out.println("恭喜猜中 ！");
               break;//如果猜中 不再重试
           }
       }
        System.out.println("游戏结束！");
    }
}
