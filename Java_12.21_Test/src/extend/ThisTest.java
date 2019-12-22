package extend;

public class ThisTest {
     public static void main(String[] args){
    	 Local aa=new Local();
     }
}

class Local{
	public int i=1; //i为成员变量
	Local(int i){   //i为局部变量
		System.out.println("this.i="+this.i);  //this.i指的是对象本身的成员变量
		System.out.println("i="+i);  //此处i是局部变量
	}
	Local(){
		this(6);
	}
}
