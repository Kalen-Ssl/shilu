package classTest;

public class Employee {
	private String name;
	private double salary;
	
	Employee(){
		name="unknown";
		salary=0;
	}
	
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	
//	public static void main(String[] args){
//		Employee[] dir=new Employee[4];
//		Employee e1=new Employee();
//		e1.setName("����");
//		e1.setSalary(100);
//		dir[0]=e1;
//		dir[1]=new Employee();
//		for(int i=2;i<=3;i++){
//			dir[i]=new Employee("user"+i,200);
//		}
//		//���Ա����Ϣ
//		for(int j=0;j<=3;j++){
//			System.out.println("Ա��������"+dir[j].getName());
//			System.out.println("Ա�����ʣ�"+dir[j].getSalary());
//		}
//	}
	
	
}
