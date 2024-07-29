public class act15{
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 2, 2, 3, 4};
        System.out.println("Final one: " + hasExactlyFiveTwos(array));
    }
    public static boolean hasExactlyFiveTwos(int[] array) {
        int count = 0;
        System.out.println("Start of process");
        for (int num : array) {
            System.out.println("In process: " + num);
            if (num == 2) {
                count++;
                System.out.println("Amount of 2 " + count);
            }
        }
        System.out.println("Results: " + count);
        return count==5;
    }
}