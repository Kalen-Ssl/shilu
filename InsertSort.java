package bishi;


public class InsertSort {
    public static void main(String[] args) {
        int[] ins={2,3,5,1,23,6,78,34};
        int[] ins2=sort(ins);
        for(int i:ins2){
            System.out.println(i);
        }
    }

    public static int[] sort(int[] ins){
        for(int i=1;i<ins.length;i++){

            for(int j=i;j>0;j--){
                if(ins[j]<ins[j-1]){
                    int temp=ins[j-1];
                    ins[j-1]=ins[j];
                    ins[j]=temp;
                }
            }
        }
        return ins;
    }

}
