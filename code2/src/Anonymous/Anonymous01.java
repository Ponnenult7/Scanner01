package Anonymous;
/*
创建对象的标准格式
类名称 对象名称 = new 类名称();

匿名对象就是只有右边的对象 没有左边的名字和赋值运算符
new 类名称();

匿名对象只能使用唯一的一次 下次再用不得不在创建一个新对象
使用建议：如果确定有一个对象只需要使用唯一的一次 就可以使用匿名对象
 */
public class Anonymous01 {
    public static void main(String[] args) {
        person one = new person();
        one.name="张三";
        one.showname();
        System.out.println("===================");

        //匿名对象
        new person().name="李四";
        new person().showname();
    }

}
