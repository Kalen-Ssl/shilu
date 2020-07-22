package days;

//密码验证合格程序


import java.util.Scanner;

public class day24_2 {
    static boolean isOk(char[] s){
        if(s.length <= 8) return false;
        int lower = 0, captial = 0, number = 0, other = 0;
        for(int i=0; i < s.length; i++) {
            if(s[i] >= 'a' && s[i] <= 'z') lower = 1;
            else if(s[i] >= 'A' && s[i] <= 'Z') captial = 1;
            else if(s[i] >= '0' && s[i] <= '9') number = 1;
            else other = 1;
        }
        if(lower + captial + number + other < 3) return false;

        String str = String.valueOf(s);
        for(int i=3; i < s.length; i++) {
            String t = str.substring(i-3, i);
            for(int j=3; j < s.length; j++) {
                String t2 = str.substring(j-3, j);
                if(i != j && t.equals(t2)) {
                    //System.out.println(i+","+ j);
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] s = sc.next().toCharArray();
            if(isOk(s))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
    }
}