package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存入20个随机数字 然后筛选出其中的偶数元素放到小集合当中
要求 使用自定义的方法来实现筛选
 */
public class ArrayListProblem04 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        ArrayList<Integer> smallList = new ArrayList<>();
        Random r = new Random();

        int randomNum = 0;

        for (int i = 0; i < 20; i++) {
            randomNum = r.nextInt(100)+1;
            bigList.add(randomNum);
        }

        System.out.println(bigList);
        ArrayList<Integer> resultList = getSmallList(bigList);
        System.out.println("偶数的结果总共有" + resultList.size() + "个,结果如下：");
        System.out.println(resultList);

        /*
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num%2==0){
                smallList.add(num);
            }
        }
        System.out.println(smallList);
        */
    }
    /*
    三要素
    返回值类型 ArrayList小集合(元素个数不确定)
    方法名称 getSmallList
    参数列表 ArrayList大集合(20个随机数)
     */
    //接收大集合参数 返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        //创建一个小集合 用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }

}
