package bishi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//给你一个包含 n 个整数的数组 nums，判断 nums 中
// 是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
// 请你找出所有满足条件且不重复的三元组。
//注意：答案中不可以包含重复的三元组。

//ps:只通过了三分之一
// -1 0 1 2 -1 -4
// 样例输出
//-1 -1 2
//-1 0 1
public class aiqiyi3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        while(sc.hasNextInt()){
            stack.add(sc.nextInt());
        }
        int[] num=new int[stack.size()];
        for(int i=0;i<num.length;i++){
            num[i]=stack.get(i);
        }
        Arrays.sort(num);
        for(int m=0;m<num.length-2;m++){
            for(int n=m+1;n<num.length-1;n++){
                for(int p=n+1;p<num.length;p++){
                    if(num[n]+num[m]+num[p]==0){
                        System.out.print(num[m]+" ");
                        System.out.print(num[n]+" ");
                        System.out.println(num[p]);
                    }
                }
            }
        }


    }
}

