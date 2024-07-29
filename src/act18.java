public class act18{
    public static void main(String [] args){
        int[] array=new int[]{2,3,4};
        System.out.println(devyatka(array));
    }
    public static boolean devyatka(int[] numbers) {
        int length = Math.min(numbers.length, 4);
        int zero=0;
        for (int i = 0; i < length; i++) {
            zero+=numbers[i];
            if (zero == 9) {
                return true;
            }
        }
        return false;
    }
}
