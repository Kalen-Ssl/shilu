package demo2;

/**
 * 酒店房间管理系统：可以查询房间、预定房间、退房、退出系统。
 * @author lenovo
 * @version 1.0
 * 作业1：订房的bug修复,要求能够规避不合理的输入；
 * 作业2：退房的bug修复，要求能够规避不合理的输入；
 */
import java.util.Scanner;

public class RoomTest {
	// 酒店的楼层
	static int row = 9;
	// 每一层楼的房间数
	static int col = 9;
	static String[][] rooms = new String[row][col];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				rooms[i][j] = "empty";
			}
		}
		
		while(true) {
			help();
			String con = sc.next();
			if(con.equals("search")) {
				//打印房间信息
				searchRoom();
			}
			else if(con.equals("in")) {
				//预定房间
				inTheRoom();
			}
			else if(con.equals("out")) {
				// 退房
				outTheRoom();
			}
			else if(con.equals("exit")) {
				System.out.println("退出系统！！！");
				break;
			}
		}
	}
	
	/**
	 * 查询房间，按行列打印出来
	 */
	public static void searchRoom() {
		for(int i = 0; i < rooms.length; i++) {
			for(int j = 0; j < rooms[i].length; j++) {
				System.out.print(((i+1)*1000+j+1) + "\t");
			}
			System.out.println();
			for(int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j] + "\t");
			}
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	
	/**
	 * 预定房间，输入房间号，判断是否合理以及房间是否已经住人，然后输入姓名，订房成功
	 */
	public static void inTheRoom() {
		boolean success = false;
		int num;
		while(!success) {
			System.out.println("请输入您要预定的房间号：");
			// 判断输入是否合理，这个地方有bug
			num = sc.nextInt();
			// 判断该房间是否已经有人
			int row = num / 1000 - 1;
			int col = num % 1000 - 1;
			if(rooms[row][col].equals("empty")) {
				System.out.println("请输入您的姓名：");
				String name = sc.next();
				rooms[row][col] = name;
				System.out.println(name + "成功预定" + num + "号房间。");
				success = true;
			}
			else {
				System.out.println("该房间已经有人预定了！！！");
			}
		}
	}
	
	/**
	 * 退房，输入房间号，判断是否合理，输入退房人姓名，必须是订房人本人才能退房，退房成功
	 */
	public static void outTheRoom() {
		System.out.println("请输入退房间号：");
		// 此处有bug，要判断输入是否合理
		int num = sc.nextInt();
		int row = num / 1000 - 1;
		int col = num % 1000 - 1;
		// 判断如果房间本来就是空的，则提示用户输入错误
		if(rooms[row][col].equals("empty")) {
			System.out.println("该房间已经为空，无需退房");
		}
		else {
			System.out.println("请输入您的名字：");
			String name = sc.next();
			if(rooms[row][col].equals(name)) {
				rooms[row][col] = "empty";
				System.out.println("退房成功！！！");
			}
			else {
				System.out.println("房间必须本人来退！！！");
			}
		}
			
	}
	
	
	/**
	 * 打印酒店管理系统的界面
	 */
	public static void help() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~欢迎光临财大酒店~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~请选择操作~~~~~~~~~~~~");
		System.out.println("~~~~~~~请输入 search 查房~~~~~~~~~~~~");
		System.out.println("~~~~~~~请输入 in 预定房间~~~~~~~~~~~~");
		System.out.println("~~~~~~~请输入 out 退房~~~~~~~~~~~~");
		System.out.println("~~~~~~~请输入 exit 退出系统~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~请输入指令：");
	}
}
