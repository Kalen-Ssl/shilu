package chapters6;
import java.util.Scanner;

public class Character {
  public static void main(String[] args){
       //统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数
	  int bigCount=0;
	  int smallCount=0;
	  int numberCount=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("请输入一个字符串：");
	  String line =sc.nextLine();
	  char[] chs=line.toCharArray();
	  for(int x=0;x<chs.length;x++){
		  char ch=chs[x];
		  if(java.lang.Character.isUpperCase(ch)){
			  bigCount++;
		  }
		  else if(java.lang.Character.isLowerCase(ch)){
			  smallCount++;
		  }else if(java.lang.Character.isDigit(ch)){
			  numberCount++;
		  }
	  }
	  System.out.println(bigCount);
	  System.out.println(smallCount);
	  System.out.println(numberCount);
	  
	  
	  
  }


}
