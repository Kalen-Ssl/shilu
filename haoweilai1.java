package bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/**
 * @proargm: Java_ssl
 * @description:
 * @author:shilu
 * @create: 2020--22 20:33
 **/
public class haoweilai1 {


    public  int thirdMax (int[] nums) {

        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        if(list.size() > 3){
            return list.get(list.size()-3);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;

//        int index=0;
//        Arrays.sort(nums);
//        for(int i=nums.length-1;i>=0;i--){
//            if(nums[0]==nums[nums.length-1]){
//                return nums[0];
//            }
//            if(i!=0){
//                while(nums[i]==nums[i-1]&&i!=0){
//                    i--;
//                }
//            }
//            index=index+1;
//            if(index==3){
//                return nums[i];
//
//            }
//        }
//        return nums[nums.length-1];

    }

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,1};
        haoweilai1 a=new haoweilai1();
        System.out.println(a.thirdMax(arr));
    }

}
// for(int j=0;j<nums.length;j++){
//        System.out.println(nums[j]+" ");
//        }