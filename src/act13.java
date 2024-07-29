public class act13 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, -2, 3, 4, 5};
        System.out.println(plusorminus(numbers));
        System.out.println(plusorminus(numbers2));
    }
    public static boolean plusorminus(int[] chisla) {
        for (int num : chisla) {
            if (num <= 0) {
                return false;
            }
        }
        return true;
    }
}