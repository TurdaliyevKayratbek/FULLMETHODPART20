public class act17 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        System.out.println(foronetothree(array1));
    }
    public static boolean foronetothree(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1 && num[i+1] == 2 && num[i+2] == 3) {
                return true;
            }
        }
        return false;
    }
}