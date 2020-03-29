package work;

import java.util.Arrays;

/**
 * @description:
 * @author:   shilu
 * @create: 2020--28 15:05
 **/
public class TestSort {

    //直接插入排序
    public static void insertSort(int[] array) {
        for(int i=1;i<array.length;i++){
           int tmp=array[i];
           int j;
           for(j=i-1;j>=0;j--){
               if(array[j]>=tmp){
                 array[j+1]=array[j];
               }else{
                   break;
               }
           }
            array[j+1]=tmp;
       }
    }


    //希尔排序
    public static void shell(int[] array,int gap){
        for(int i=gap;i<array.length;i++){
            int tmp=array[i];
            int j;
            for(j=i-gap;j>=0;j-=gap){
                if(array[j]>=tmp){
                    array[j+gap]=array[j];
                }else{
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }

    //选择排序
    public static void selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[i]){
                    int tmp=array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                }
            }
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] array){
        boolean flg=false;
        for(int i=0;i<array.length-1;i++){
            flg=false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if(!flg){
                break;
            }
        }
    }

    public static void shellSort(int[] array){
        int[] drr={5,3,1};
        for(int i=0;i<drr.length;i++){
            shell(array,drr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        //insertSort(array);
        //System.out.println(Arrays.toString(array));
        //shellSort(array);
        //selectSort(array);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


}
