import java.util.Random;

public class act4 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arrayrndm=new int[50];
        for (int i = 0; i < arrayrndm.length; i++) {
            arrayrndm[i] = random.nextInt(1, 50);
        }
        System.out.print("Array: ");
        for (int number : arrayrndm) {
            System.out.print(number + " ");
        }

        Brightburn(arrayrndm, 34);
    }
    public static void Brightburn(int[] numbers, int n) {
        int counter = 0;
        for (int number : numbers) {
            if (number == n) {
                counter++;
            }
        }
        System.out.println(" \nnum: " + n +" appears: "+ counter);
    }
}
