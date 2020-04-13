package LeetCode;

//List中存放了100000个数据，查找其中第一个重复的数字
import java.util.*;

public class List100000chongfu {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10_0000;i++){
            arrayList.add(random.nextInt(60000));
        }
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for (Integer val:arrayList) {
            if(hashSet.contains(val)){
                System.out.println(val);
                return;
            }
            hashSet.add(val);
        }
    }
}
