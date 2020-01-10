class LeetCode26{
     int removeDuplicates(int[] nums) {
         if (nums == null || nums.length == 0) {
             return 0;
         }
         int k = 0;
         int len = 0;
         for (int i = 0; i < nums.length - 1; i++) {
             if (nums[i] == nums[i + 1]) {
                 continue;
             } else {
                 k++;
                 nums[k] = nums[i + 1];
                 len++;
             }
         }
         return len + 1;

     }
        public static void main(String[] args){

        }
    }