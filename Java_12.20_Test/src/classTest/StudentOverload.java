package classTest;

//���췽������
public class StudentOverload {
    int no;
    String name;
    
    StudentOverload(String name){
    	this.name=name;
    }
    
    StudentOverload(int no,String name){
    	this.no=no;
    	this.name=name;
    }
    
    public static void main(String[] args){
		StudentOverload s1=new StudentOverload("����");
		StudentOverload s2=new StudentOverload(2,"����");
		System.out.println("name="+s1.name+"   no="+s1.no);
		System.out.println("name="+s2.name+"   no="+s2.no);
    }
	
}
