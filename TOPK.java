package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class TopKComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

public class TOPK {
    public static Integer[] findKNum(Integer[] array,int k){
        TopKComparator topKComparator=new TopKComparator();
        //建立了一个堆，堆的大小是K，且传入了一个比较器，从小到大比较
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(k,topKComparator);
        for(int i=0;i<array.length;i++){
            if(maxHeap.size()<k){
                maxHeap.offer(array[i]);
            }else{
                Integer val=maxHeap.peek();
                if(val!=null&&val>array[i]){
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        Integer[] ret=new Integer[k];
        for(int i=0;i<k;i++){
            Integer num=maxHeap.poll();
            ret[i]=num;
        }
        return ret;
    }


    public static void main(String[] args) {
        Integer[] array={12,5,19,8,10,20,6};
        Integer[] ret=findKNum(array,3);
        System.out.println(Arrays.toString(ret));
    }
}
