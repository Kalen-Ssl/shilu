package days;

//第K大的数
public class day1_2 {
    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int tmp = array[start];
        int low = start;
        int high = end;
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                high -= 1;
            }
            array[low] = array[high];
            while (low < high && array[low] < tmp) {
                low += 1;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        quickSort(array, start, low - 1);
        quickSort(array, low + 1, end);
        return;
    }

    private static int findKth(int[] a, int n, int K) {
        quickSort(a, 0, a.length - 1);
        int last = n - 1;
        int tmp = a[last];
        int i = 0;
        if (K==1){
            return a[a.length-1];
        }
        while (i != K) {
            tmp = a[last];
            if (tmp != a[last-1]) {
                i++;
                last--;
            } else {
                last--;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        for (int i = 0; i <a.length-1 ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(findKth(a, a.length, 3));
    }

}
