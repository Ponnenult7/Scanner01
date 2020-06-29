package ArrayList;

import java.util.ArrayList;
/*
如果希望向集合ArrayList中存储基本数据类型数据 必须使用基本类型对应的包装类

基本类型   包装类(引用类型 包装类都位于java.lang包下)
byte       Byte
short      Short
int        Integer
long       Long
double     Double
float      Float
char       Character
boolean    Boolean

Jdk1.5+开始 支持自动装箱 自动拆箱
自动装箱：基本类型-->包装类型(引用类型)
自动拆箱：包装类型-->基本类型
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //错误 泛型只能是引用类型 不能是基本类型
        //ArrayList<int> listB = new ArrayList<>();
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        int num = listC.get(1);
        System.out.println("第一号元素是：" + num);
    }
}
