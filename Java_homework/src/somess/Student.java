package somess;


//编写一个类Student，该类拥有属性：校名、学号、性别、出生日期、
//方法包含设置姓名和成绩（setName（）、serScore（）），再编写Student的
//子类Undergraduate（大学生）。Undergraduate类除拥有父类的上述属性和方法外，
//还拥有附加的属性和方法：属性包括系（department）、专业（major）；
//方法包含设置系别和专业（setDepartment（），setMajor（））

public class Student {
	String name;
	int studentNo;
	int score;
	String sex;
	String data;
	String school;
	public void setName(String name){
		this.name=name;
	}
	public void setScore(int score){
		this.score=score;
	}
	
	
	 public static void main(String[] args){
		    Undergraduate student1=new Undergraduate();
			student1.school="西安财经大学";
			student1.studentNo=1705990425;
			student1.sex="女";
			student1.data="1997-4-4";
			student1.name="史姝璐";
			student1.score=80;
			student1.department="计算机";
			student1.major="软件工程";
			System.out.println("姓名:"+student1.name+"\n"+"出生日期"+student1.data+"\n"
			 +"性别："+student1.sex+"\n"+"分数："+student1.score+"\n"+"系："+student1.department+"\n"
			 +"专业："+student1.major+"\n");
			student1.setName("史璐");
			student1.setScore(85);
			student1.setDepartment("计算机类");
			student1.setMajor("软件工程专业");
			System.out.println("姓名:"+student1.name+"\n"+"出生日期"+student1.data+"\n"
			 +"性别："+student1.sex+"\n"+"分数："+student1.score+"\n"+"系："+student1.department+"\n"
			 +"专业："+student1.major+"\n");
	 }

	
	
}



//department）、专业（major）；
//方法包含设置系别和专业（setDepartment（），setMajor（））
 class Undergraduate extends Student{
	  String department;
	  String major;
	  void setMajor(String major){
		  this.major=major;
	  }
	  void setDepartment(String department){
		  this.department=department;
	  }
 }
 
 

 
 
 
 
 