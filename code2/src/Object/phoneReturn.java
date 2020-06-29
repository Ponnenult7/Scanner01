package Object;

public class phoneReturn {
    public static void main(String[] args) {

       Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 12999.0;
        one.color = "black";
        return one;
    }
}
