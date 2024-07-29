import java.util.Random;

public class act12 {
    public static void main(String[] args) {
        int[] result = PlusArray(14);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] PlusArray(int n) {
        if (n <= 0) {
            return new int[0];
        }
        int[] array = new int[n];
        Random random = new Random();
        array[0] = random.nextInt(10);
        for (int i = 1; i < n; i++) {
            array[i] = array[i-1] + random.nextInt(1, 10);
        }
        return array;
    }
}
