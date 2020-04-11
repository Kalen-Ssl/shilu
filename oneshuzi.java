package LeetCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//给定一个非空整数数组，除了一个元素只出现一次，其余的都出现两次，
// 找到这个只出现了一次的元素
public class oneshuzi {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
               set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int ret=0;
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])){
                ret=nums[i];
                break;
            }
        }
        return ret;
    }

    //第一种方法  异或
    public int singleNumber2(int[] nums) {
        int ret=0;
        for(int i=0;i<nums.length;i++){
            ret^=nums[i];
        }
        return ret;
    }

}
