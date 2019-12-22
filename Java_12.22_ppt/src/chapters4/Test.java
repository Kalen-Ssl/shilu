package chapters4;


class Varialbe{
	int num;
	public void show(){
		int num2=20;
		System.out.println(num2);
		System.out.println(num);
	}
}


class VariableDemo{
	public static void main(String[] args){
		Varialbe v=new Varialbe();
		System.out.println(v.num);
		v.show();
	}
}


