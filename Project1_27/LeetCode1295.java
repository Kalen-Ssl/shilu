
public class LeetCode1295 {
        public int findNumbers(int[] nums) {
            int m=0;
            int j=0;
            for(int i=0;i<nums.length;i++){
                int n=nums[i];
                while(n!=0){
                    n=n/10;
                    m++;
                }
                if(m%2==0){
                    j++;
                }
                m=0;
            }
            return j;
        }
}
