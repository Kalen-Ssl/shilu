package days;

//学分绩点
import java.util.Scanner;

public class day21_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] gradeCredit=new int[n];
            int[] grade=new int[n];

            for(int i=0;i<n;i++){
                gradeCredit[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                grade[i]=sc.nextInt();
            }
            System.out.printf("%.2f",averageCredit(gradeCredit,grade));
        }
    }
    public static double averageCredit(int[] gradeCredit,int[] grade){
        double sum=0.0;
        double allClassCredit=0.0;
        for(int i=0;i<grade.length;i++){
            allClassCredit+=gradeCredit[i]*GPA(grade[i]);
            sum+=gradeCredit[i];
        }
        return allClassCredit/sum;
    }
    public static double GPA(int grade){
        double gpa = 0.0;
        if(grade>=90&&grade<=100)
            gpa=4.0;

        if(grade>=85&&grade<=89)
            gpa=3.7;

        if(grade>=82&&grade<=84)
            gpa=3.3;

        if(grade>=78&&grade<=81)
            gpa=3.0;

        if(grade>=75&&grade<=77)
            gpa=2.7;

        if(grade>=72&&grade<=74)
            gpa=2.3;

        if(grade>=68&&grade<=71)
            gpa=2.0;

        if(grade>=64&&grade<=67)
            gpa=1.5;

        if(grade>=60&&grade<=63)
            gpa=1.0;

        if(grade<60)
            gpa=0.0;

        return gpa;
    }
}
