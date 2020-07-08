package days;

//二维数组中的查找
public class day17_1 {
    public boolean Find(int [][] array,int target) {
        int m = array.length - 1;
        int i = 0;
        while(m >= 0 && i < array[0].length){
            if(array[m][i] > target)
                m--;
            else if(array[m][i] < target)
                i++;
            else
                return true;
        }

        return false;
    }
}
