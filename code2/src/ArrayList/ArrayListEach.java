package ArrayList;

import java.util.ArrayList;

public class ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("赵二");
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("马六");
        System.out.println(list);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
