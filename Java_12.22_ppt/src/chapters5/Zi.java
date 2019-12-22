package chapters5;

class Fu{
	public int num=100;
	public Fu(){
		System.out.println("Fu");
	}
	public void show(){
		System.out.println("show Fu");
	}
	public static void function(){
		System.out.println("function Fu");
	}
}

class Zi extends Fu{
	public int num=1000;
	public int num2=200;
	public Zi(){
		System.out.println("Zi");
	}
	public void show(){
		System.out.println("Zi");
	}
	public void method(){
		System.out.println("methor zi");
	}
	public static void function(){
		System.out.println("function Zi");
	}
}




