package extend;

//如果想在子类中访问父类中被覆盖的成员，可使用super
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
		 return super.getDetails();  //调用父类的getDetails方法
	 }
	 Manager(){
		 super();  //此处super()可以省略，因为默认先调用父类的
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
 
 
 
 
 
