package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
生成6个1-33之间的随机整数 添加到集合 并遍历集合
 */
public class ArrayListProblem01 {

    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            int RandonNum = r.nextInt(33)+1;

            list.add(RandonNum);

        }

        for (int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }
}
