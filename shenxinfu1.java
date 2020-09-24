package bishi;


import java.util.Scanner;

public class shenxinfu1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N,M;
            N=sc.nextInt();
            M=sc.nextInt();
            int[] arrSchool=new int[N];
            for(int j=0;j<N;j++){
                arrSchool[i]=sc.nextInt();
            }

            int[][] arrStu=new int[M+1][6];
            for(int g=0;g<M;g++){
                for(int l=0;l<6;l++){
                    arrStu[g][l]=sc.nextInt();
                }
            }


            for(int l=0;l<M;l++){
                for(int m=l+1;m<M;m++){
                    if(arrStu[l][0]<arrStu[m][0]){
                        arrStu[M]=arrStu[l];
                        arrStu[l]=arrStu[m];
                        arrStu[m]=arrStu[M];
                    }
                }
            }

            for(int l=0;l<M;l++){
                int m=1;
                while(m<5){
                    if(arrSchool[arrStu[l][m]-1]>0){
                        System.out.print(arrStu[l][m]+" ");
                        arrSchool[arrStu[l][m]-1]--;
                     break;
                    }else{
                        m++;
                    }
                }
                if(m==5){
                    System.out.println("0");
                }
            }


        }
        System.out.println("end");
    }
}
