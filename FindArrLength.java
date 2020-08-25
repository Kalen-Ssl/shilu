package fuxi;

import java.util.Scanner;
public class FindArrLength {
    public static int findLength(int[] A, int[] B) {
        int len1=A.length;
        int len2=B.length;
        int max=0;
        for (int i = 0; i <len1 ; i++) {
            int temp=0;
            for (int j = 0; j <len2 ; j++) {
                if (A[i]==B[j])
                {
                    int temp1=0;
                    temp1++;
                    int st1=i+1;
                    int st2=j+1;
                    while (st1<len1&&st2<len2&&A[st1]==B[st2])
                    {
                        st1++;
                        st2++;
                        temp1++;
                    }
                    if (temp1>temp) temp=temp1;
                }
                if (temp>max) max=temp;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lena=scanner.nextInt();
        int lenb=scanner.nextInt();
        int []A=new int[lena];
        int []B=new int[lenb];
        for (int i = 0; i <lena ; i++) {
            A[i]=scanner.nextInt();
        }
        for (int i = 0; i <lenb ; i++) {
            B[i]=scanner.nextInt();
        }
        int res=findLength(A,B);
        System.out.println(res);
    }
}


