import java.util.Random;

public class act9 {
    public static void main(String[] args) {
        int[] array = new int[15];
        PRINT(array);
    }
    public static void PRINT(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * (random.nextInt(45) + 5);
        }
        for (int numbers : array) {
            System.out.print(numbers + " ");
        }
    }
}