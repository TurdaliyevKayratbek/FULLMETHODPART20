public class act19 {
    public static void main(String[] args) {
        int[] array={1,1,1, 3, 4, 5};
        System.out.println(sameshi(array));
    }

    public static boolean sameshi(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            } else if (nums[i+1]==nums[i+2]) {
                return true;
            }
        }
        return false;
    }
}