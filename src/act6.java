public class act6 {
    public static void main(String[] args) {
        int[] array = {7, 3, 5,34 , 5};
        int k = 2;
        System.out.println("To " + k + " is: " + Plus(array, k));
    }
    public static int Plus(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        return sum;
    }
}
