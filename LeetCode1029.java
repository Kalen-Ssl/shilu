package LeetCode;

public class LeetCode1029 {
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        //去a和去b的差值不会大于999，所以数组长度2000是包含正负
        int[] ar = new int[2000];
        for(int [] i :costs ){
            sum += i[0];
            //这个i[1]-i[0]是说去b比去a贵的。如果是正数要减去
            ar[i[1]-i[0]+1000] ++;
        }
        int index = 0;
        int i = 0;
        while(i<costs.length/2){
            while(ar[index]>0&&i<costs.length/2){
                sum += (index-1000);
                ar[index]--;
                i++;
            }
            index++;
        }
        return sum;
    }
}
