package Object;

public class phoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 12999.0;
        one.color = "black";

        method(one);

    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
}
