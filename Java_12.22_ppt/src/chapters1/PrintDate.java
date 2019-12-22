package chapters1;

import java.util.Date;

public class PrintDate {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		Date date=new Date();
		String str=date.toLocaleString();
		System.out.println("当前日期"+str);
	}

}
