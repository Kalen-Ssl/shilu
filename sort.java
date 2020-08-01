package fuxi;


import java.util.Arrays;

public class sort {

    //希尔排序
    //是直接插入排序算法的一种更高效的改进版本，希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
    // 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至 1 时，整个文件恰被分成一组，算法便终止
    public static void shell(int[] array,int gap){
        for(int i=gap;i<array.length;i++){
            int tmp=array[i];
            int j;
            for(j=i-gap;j>=0;j-=gap){
                if(array[j]>tmp){
                    array[j+gap]=array[j];
                }else{
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }
    public static void shellSort(int[] array){
        int[] drr={5,3,1};
        for(int i=0;i<drr.length;i++){
            shell(array,drr[i]);
        }

    }


    //选择排序
    //第一次从待排序的元素中，选出最小的元素，存放在序列的起始位置
    //再从剩余未排序的元素中，找到最小的，放在已排序的元素的末尾
    public static void selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;i<array.length;j++){
                if(array[i]>array[j]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }



    //冒泡排序
    //依次比较两个相邻元素，顺序错误则交换，最终需要相邻的元素没有可以交换的
    //外层控制次数，大的给后面冒，内层控制
    public static void bubbleSort(int[] array){
        boolean flg=false;
        for(int i=0;i<array.length;i++){
            flg=false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg==false){
                break;
            }
        }
    }



    //快速排序
    //从两头向中间进行扫描
    public static void quickSort(int[] array,int leftIndex,int rightIndex) {
        if(rightIndex<=leftIndex){
            return;
        }

        int right=rightIndex;
        int left=leftIndex;
        int key=array[left];
        while (left<right){
            while(array[right]>key&&right>left){
                right--;
            }
            array[left]=array[right];
            while(array[left]<=key&&left<right){
                left++;
            }
            array[right]=array[left];
        }

        array[left]=key;
        quickSort(array,leftIndex,left-1);
        quickSort(array,right+1,rightIndex);


    }




    //归并排序
    //先拆开，再有序的合并
    public static void merge(int[] arr,int low,int mid,int high){
        int s1=low;
        int s2=mid+1;
        int len=high-low+1;
        int[] tmp=new int[len];
        int i=0;
        //把较小的数先移动到数组中
        while(s1<=mid&&s2<=high){
            if(arr[s1]<=arr[s2]){
                tmp[i++]=arr[s1++];
            }else{
                tmp[i++]=arr[s2++];
            }
        }
        //左边剩余的移动进去
        while(s1<=mid){
            tmp[i++]=arr[s1++];
        }

        //右边剩余的移动进去
        while(s2<=high){
            tmp[i++]=arr[s2++];
        }
        //用新数组里的数覆盖原本数组里的
        for(int j=0;j<arr.length;j++){
            arr[j+low]=tmp[j];
        }
    }


    public static int[] mergesort(int[] arr,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        return arr;
    }






    //直接插入排序
    //每一步将一个待排序的元素，按照其排序码的大小，插入到前面已经排好序的一组元素里面去
    public static void insertSort(int[] array){
        for(int i=1;i<array.length;i++){
            int tmp=array[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }



    public static void main(String args[]){
        int[] array={12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
       quickSort(array,0,14);
        System.out.println(Arrays.toString(array));
    }
}
