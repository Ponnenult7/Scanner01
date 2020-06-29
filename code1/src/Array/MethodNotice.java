package Array;
/*
使用方法的注意事项
    1.方法应该使用在类当中 但是不能在方法中定义方法 不能嵌套
    2.方法定义前后顺序无所谓
    3.方法定义后不会执行 如果希望执行 一定要调用 单独调用 打印调用 赋值调用
    4.如果方法有返回值 那么必须写上 “return 返回值 ;” 不能没有
    5.return 后面的返回值数据 必须和方法的返回值类型对应起来
    6.对于一个void没有返回值的方法 不能写后面的返回值 这能写return自己
    7.对于方法当中最后一行的return可以省略不写
    8.一个方法当中可以有多个return语句 但是必须保证同时只有一个语句会被执行到
 */
public class MethodNotice {
    public static void main(String[] args) {
        System.out.println(getMax(1,2));
    }
    public static int Method1(){
        return 10 ;
    }

    public static void Method2(){
    //    return 10; //错误写法！ 方法没有返回值 return后面就不能写返回值
        return ;//没有返回值 只有结束方法的执行而已
    }

    public static void Method3(){
        System.out.println("aaa");
        System.out.println("bbb");
      //  return ;   //最后一行的return可以不写
    }

    public static int getMax(int a,int b){
        if (a>b) {
            return a;
        }else{
            return b;
        }
    }
}
