package Object;
/*
对于基本类型当中的boolean值 Getter方法一定要写成isXxx的形式 setXxx的形式不变
 */
public class PeoplePrivate01 {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
    }

    public void show(){
        System.out.println("我叫 " + name + " 我的年龄是 " + age);
    }

    public void setName(String str){
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }


}
