package classTest;

public class Student {
	int no;
	String name;
	
	Student(int no,String name){
		this.no=no;
		this.name=name;
	}
	
	
	public static void main(String[] args){
		Student s1=new Student(1,"����");
		Student s2=new Student(2,"����");
		System.out.println("name="+s1.name+"   no="+s1.no);
		System.out.println("name="+s2.name+"   no="+s2.no);
	}
	
	

}
