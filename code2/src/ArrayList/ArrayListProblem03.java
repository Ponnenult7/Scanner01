package ArrayList;

        import java.util.ArrayList;

/*
定义以指定格式打印集合的方法(ArrayList类型作为参数) 使用{}括起集合 使用@分隔每个
元素 格式参照(元素@元素@元素)
 */
public class ArrayListProblem03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("马六");

        printArrayList(list);
        /*
        System.out.print("{ ");
        System.out.print(list.get(0)+"@");
        System.out.print(list.get(1)+"@");
        System.out.print(list.get(2)+"@");
        System.out.print(list.get(3));
        System.out.print(" }");
        */
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{ ");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size()-1){
                System.out.println(name + " }");
            }else{
                System.out.print(name+"@");
            }
        }
    }
}
