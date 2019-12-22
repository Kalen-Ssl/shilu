package extend;

public class Student extends Person{
	 String schoolname;
	 public void GotoSchool(){
		 System.out.println("i am going to school");
	 }
	 
	 public static void main(String[] args){
		 Student stu1=new Student();
		 stu1.setName("ะกอ๕");
		 stu1.setAge(10);
		 stu1.schoolname="CQ";
		 stu1.Say();
		 stu1.GotoSchool();
		 System.out.println("my name is"+stu1.getName());
		 System.out.println("my schoolname is"+stu1.schoolname);
	 }
	
}
