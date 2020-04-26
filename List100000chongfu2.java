package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

//list中100000个数据，去掉其中所有重复的
public class List100000chongfu2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10_0000;i++){
            arrayList.add(random.nextInt(60000));
        }
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for (Integer val:arrayList) {
            hashSet.add(val);
        }
        System.out.println(hashSet);
    }
}
