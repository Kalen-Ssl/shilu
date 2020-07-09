package days;

import java.util.Scanner;

//统计每个月兔子的总数
public class day18_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input=sc.nextInt();
            System.out.println(getNumber(input));
        }
    }

    public static int getNumber(int month){
        if(month==1||month==2){
            return 1;
        }
        int tempold=1;
        int tempyoung=1;
        int mounth1=1;
        int mounth2=0;
        for(int j=4;j<=month;j++){
            tempold+=mounth2;
            mounth2=mounth1;
            mounth1=tempold;
            tempyoung=mounth1+mounth2;
        }
        return tempold+tempyoung;
    }
            //第一步，第二个月的变成了有生育能力的兔子
            //第二步，一个月大的兔子变成了两个月大的兔子
            //第三步，有生育能力的兔子生出了一个月大的小兔子
            //当月小兔子的个数

}
