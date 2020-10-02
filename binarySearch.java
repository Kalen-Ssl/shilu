package bishi;


public class binarySearch {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,6,7,8,9,10};
        System.out.println( binSearch_2(3,array,0,array.length-1));
    }

    public static int binSearch_1(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        int middle = 0;
        if (key < array[low] || key > array[high] || low > high) {
            return -1;
        }
        while (low <= high) {
            middle = (low + high) / 2;
            if (middle == key) {
                return array[middle];
            } else if (middle < key) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }


    public static int binSearch_2(int key,int[] array,int low,int high){
        if (key < array[low] || key > array[high] || low > high) {
            return -1;
        }
        int middle = (low+high)/2;
        if(array[middle]>key){
            return  binSearch_2(key,array,low,middle-1);
        }else if(array[middle]<key){
            return binSearch_2(key,array,middle+1,high);
        }else{
            return array[middle];
        }
    }

}
