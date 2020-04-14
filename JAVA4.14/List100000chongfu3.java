package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//统计10万个数据中，统计重复数字出现的次数
public class List100000chongfu3 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_0000; i++) {
            arrayList.add(random.nextInt(60000));
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        //k 数字   v 次数
        for(Integer key:arrayList){
            if(map.get(key)==null){
                map.put(key,1);
            }else{
                Integer val=map.get(key);
                map.put(key,val+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("重复的数字："+entry.getKey()+"重复的次数"+entry.getValue());
        }

    }
}
