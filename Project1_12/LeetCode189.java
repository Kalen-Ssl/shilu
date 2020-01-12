
public class LeetCode189 {
    void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int fir = nums[nums.length - 1];
            for (int j = nums.length - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = fir;
        }
    }
}
