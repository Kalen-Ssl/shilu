package bishi;


import java.util.Scanner;
import java.util.Stack;

//给定一个大小为 n 的整数数组，找到其中的多数元素。多数元素是指在数组中出现次数大于『n/2』的元素。
//你可以假设数组是非空的，并且给定的数组总是存在多数元素。
public class aiqiyi2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        while(sc.hasNextInt()){
          stack.add(sc.nextInt());
        }
        int[] num=new int[stack.size()];
        for(int o=0;o<num.length;o++){
            num[o]=0;
        }
        int length=stack.size();
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
               if(stack.get(i).equals(stack.get(j))){
                      num[i]=num[i]+1;
               }
            }
        }
        for(int m=0;m<stack.size();m++){
            if(num[m]>stack.size()/2){
                System.out.println(stack.get(m));
                break;
            }
        }

    }
}
