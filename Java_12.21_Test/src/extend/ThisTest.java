package extend;

public class ThisTest {
     public static void main(String[] args){
    	 Local aa=new Local();
     }
}

class Local{
	public int i=1; //iΪ��Ա����
	Local(int i){   //iΪ�ֲ�����
		System.out.println("this.i="+this.i);  //this.iָ���Ƕ�����ĳ�Ա����
		System.out.println("i="+i);  //�˴�i�Ǿֲ�����
	}
	Local(){
		this(6);
	}
}
