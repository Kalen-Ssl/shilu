package bishi;

import java.util.ArrayList;
import java.util.Arrays;

//给定数组，求最大连续子数组的和
public class haoweilai2 {
    public int maxSubArray (int[] nums) {
        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i],dp[i-1] + nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;

//        int n=nums.length;
//        int now=0;
//        int max=0;
//        for(int i=-1;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                now=now+nums[j];
//                if(now>max){
//                    max=now;
//                }
//            }
//           now=0;
//        }
//        return max;
    }

    public static void main(String[] args) {
        int[] brr={-2,1,-3,4,-1,2,1,-5,4};
        haoweilai2 b=new haoweilai2();
        System.out.println(b.maxSubArray(brr));
    }
}










