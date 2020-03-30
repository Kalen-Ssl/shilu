package test;

import java.util.Random;

/**
 *产生50道100以内加减法
 */
public class ExerciseGenerator {
    public static void main(String[] args){
        final int EQUATION_NUM=50;//算式的数量
        final int MAX_VALUE=100;//加法算式约束：结果不能超过100
        final int MIN_VALUE=0;//减法算式约束：结果不能小于0
        final int NUM_PER_LINE=5;//

        printHeader("程序输出"+EQUATION_NUM+"道"+MAX_VALUE+"以内的加法算式");//打印输出头信息
        generateExerciseOfAdditionEquations(EQUATION_NUM,MAX_VALUE,NUM_PER_LINE);//产生加法算式
        printHeader("程序输出"+EQUATION_NUM+"道"+MAX_VALUE+"以内的减法算式");//打印输出头信息
        generateExerciseOfSubtractionEquations(EQUATION_NUM,MIN_VALUE,NUM_PER_LINE);//产生减法算式
    }

    //打印输出信息
    public static void printHeader(String str){
        System.out.println("------------------------");
        System.out.println(str);
        System.out.println("-------------------------");
    }


    //产生一个操作数
    public static int generateOperand(){
        Random random=new Random();
        return random.nextInt(101);
    }


    /**
     * 产生加法算式习题
     * @param equ_num 习题中算式数量
     * @param max_value 加法结果的最大值
     * @param num_per_line 打印格式：每行算式数目
     */
     public static void generateExerciseOfAdditionEquations(int equ_num,int max_value,int num_per_line){
         int m,n,v;
         for(int i=0;i<equ_num;i++){
             do{
                 m=generateOperand();
                 n=generateOperand();
                 v=m+n;
             }while(v>max_value);
             if(i%num_per_line==0){
                 System.out.println();
                 System.out.println((i+1)+"~"+(i+5)+":  ");
             }
             System.out.println(m+"+"+n+"="+v+"  ");
         }
     }

    /**
     * 产生减法算式习题
     * @param equ_num   习题中算式数量
     * @param min_value 减法结果的最大值
     * @param num_per_line  打印格式：每行算式数目
     */
    public static void generateExerciseOfSubtractionEquations(int equ_num,
                                                              int min_value, int num_per_line) {
        int m, n, v;
        for(int i = 0; i < equ_num; i++) {
            do {
                m = generateOperand();
                n = generateOperand();
                v = m - n;
            }while(v < min_value);
            if(i % num_per_line == 0) {
                System.out.println();
                System.out.print((i+1) + " ~ " + (i+5) + ":     ");
            }
            System.out.print(m + " - " + n + " = " + v + "    ");
        }
    }



}








