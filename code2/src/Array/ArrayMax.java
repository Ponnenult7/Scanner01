package Array;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,20,30,20,10000,30,100,-20};
        int max = array[0];//比武擂台
        for (int i = 1;i<array.length;i++){
            //如果当前元素比max更大 则换人
            if(array[i]>max){
                max=array[i];

            }
        }
        //谁最后最厉害 就能在max中留到最后
        System.out.println("最大值 " + max);
    }
}
