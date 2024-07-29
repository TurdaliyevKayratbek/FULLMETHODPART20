import java.util.Arrays;

public class act7 {
    public static void main(String[]args){
        int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
        System.out.println(ReturnHim(array));
    }
    public static int ReturnHim(int[] array){
        int queue=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0) {
                queue +=array[i];
            }
        }
        return queue;
    }
}