package chapters4;

class Demo{
	public int sum(int a,int b){
		return a+b;
	}
}

class Student{
	int a;
	public void show(){
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentDemo{
	public void method(Student s){
		s.a=100;
		s.show();
	}
}


public class Test2 {
    public static void main(String[] args){
//    	Demo d=new Demo();
//    	int result=d.sum(10, 20);
//    	System.out.println(result);
//    	StudentDemo sd=new StudentDemo();
//    	Student s=new Student();
//    	System.out.println(s.a);
//    	sd.method(s);
//    	System.out.println(s.a);
    	//��������
    	Student s=new Student();
    	s.show();
    	s.show();
    	new Student().show();
    	StudentDemo sd=new StudentDemo();
    	sd.method(new Student());
    }
}
