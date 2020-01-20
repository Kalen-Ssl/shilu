
public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > target) {
                return j;
            }
        }
        return 0;
    }
}
