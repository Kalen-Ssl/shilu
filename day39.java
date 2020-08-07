package days;

import java.util.ArrayList;
import java.util.Scanner;

//乒乓球筐
public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] box=s.split(" ");
            ArrayList<Character> a=new ArrayList<Character>();
            ArrayList<Character> b=new ArrayList<Character>();
            for(int i=0;i<box[0].length();i++){
                a.add(box[0].charAt(i));
            }
            for(int j=0;j<box[1].length();j++){
                b.add(box[1].charAt(j));
            }
            for(int q=0;q<b.size();q++){
                if(a.contains(b.get(q))){
                    a.remove(a.get(a.indexOf(b.get(q))));
                    b.remove(q);
                    q--;
                }
            }
            if(b.size()==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            a=null;
            b=null;
        }
    }
}
