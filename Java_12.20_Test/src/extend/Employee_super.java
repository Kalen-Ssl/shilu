package extend;

//������������з��ʸ����б����ǵĳ�Ա����ʹ��super
 class Employee{
     private String name;
     private int salary;
     public String getDetails(){
    	 return "Name:"+name+"\nSalary:"+salary;
     }
     Employee(){
    	 name="Tom";
    	 salary=1234;
     }
}
 
 class Manager extends Employee{
	 public String department;
	 public String getDetails(){
		 System.out.println("i am in manager");
		 return super.getDetails();  //���ø����getDetails����
	 }
	 Manager(){
		 super();  //�˴�super()����ʡ�ԣ���ΪĬ���ȵ��ø����
		 department="sale";
	 } 
 }
 
 public class Employee_super{
	 public static void main(String[] args){
		 Manager m=new Manager();
		 System.out.println(m.getDetails());
		 System.out.println("department:"+m.department);
	 }
 }
 
 
 
 
 
