package classTest;

public class EmployeeDirectory {
	public static void main(String[] args){
		Employee[] dir=new Employee[4];
		Employee e1=new Employee();
		e1.setName("张三");
		e1.setSalary(100);
		dir[0]=e1;
		dir[1]=new Employee();
		for(int i=2;i<=3;i++){
			dir[i]=new Employee("user"+i,200);
		}
		//输出员工信息
		for(int j=0;j<=3;j++){
			System.out.println("员工姓名："+dir[j].getName());
			System.out.println("员工工资："+dir[j].getSalary());
	     }
	}
}


