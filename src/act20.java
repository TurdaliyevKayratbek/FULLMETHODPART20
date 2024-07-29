public class act20 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 33, 33};
        System.out.println(UgaBooga(nums));
    }
    public static int UgaBooga(int[] nums) {
        int queue=0;
        for (int i = 0; i < nums.length; i++) {
            boolean One = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    One = false;
                    break;
                }
            }
            if (One) {
                return nums[i];
            }
        }
        return queue;
    }
}