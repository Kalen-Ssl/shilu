import java.util.Scanner;

public class RomeToArabic {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        System.out.println(r2a(mScanner.nextLine()));
        System.out.println(a2r(mScanner.nextInt()));
     }
   //罗马数字转换阿拉伯数字
    public static int r2a(String m) {
        int graph[] = new int[400];
        graph['I'] = 1;
        graph['V'] = 5;
        graph['X'] = 10;
        graph['L'] = 50;
        graph['C'] = 100;
        graph['D'] = 500;
        graph['M'] = 1000;
        char[] num = m.toCharArray();
        int sum = graph[num[0]];
        for (int i = 0; i < num.length - 1; i++) {
            if (graph[num[i]] >= graph[num[i + 1]]) {
                sum += graph[num[i + 1]];
            } else {
                sum = sum + graph[num[i + 1]] - 2 * graph[num[i]];
            }
        }
        return sum;
    }
   //阿拉伯数字转换罗马数字
    public static String a2r(int number) {
        String rNumber = "";
        int[] aArray = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] rArray = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                "IX", "V", "IV", "I" };
        if (number < 1 || number > 3999) {
            rNumber = "-1";
        } else {
            for (int i = 0; i < aArray.length; i++) {
                while (number >= aArray[i]) {
                    rNumber += rArray[i];
                    number -= aArray[i];
                }
            }
        }
        return rNumber;
    }
}



