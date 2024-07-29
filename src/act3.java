import java.util.Random;

public class act3 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] rndm=new int[50];
        for (int i=0;i<rndm.length; i++) {
            rndm[i]=random.nextInt(1,50);
        }
        Biggerthan20(rndm);
    }
    public static void Biggerthan20(int[] nums) {
        for (int num:nums) {
            if (num>20) {
                System.out.println(num);
            }
        }
    }
}
