public class act14 {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15, 45, -1, 6};
        int naidy = 9;
        ischi(array, naidy);
    }

    public static void ischi(int[] nums, int target) {
        boolean found = false;
        for (int i=0; i <= nums.length; i++) {
            for (int j=i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j]==target) {
                    System.out.println("Solvation: " +nums[i] + ", "+ nums[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No");
        }
    }
}