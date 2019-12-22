package chapters2;

public class Student {
	public int roll;
	public String name;
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	
	public static void main(String[] args){
		//Student[] arr;
		//arr=new Student[5];
		Student[] arr=new Student[5];
		arr[0]=new Student(1,"shid");
		arr[1]=new Student(2,"shsds");
		arr[2]=new Student(3,"ssdfsdhid");
		arr[3]=new Student(4,"shdgfsds");
		arr[4]=new Student(5,"sfdgfgdfgfdhid");
		for(int i=0;i<arr.length;i++){
			System.out.println("µÚ"+i+"¸ö:"+arr[i].roll+" "+arr[i].name);
		}
	}

}
