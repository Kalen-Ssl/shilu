
public class Text2 {
	public static void main(String[] args){
    		 //����λ�õ������͵���������
      int a,aa,aaa;   
    	for(int i=100;i<999;i++){
    		a=i%10;
    		aa=i/10%10;
    		aaa=i/100;
    		if(a*a*a+aa*aa*aa+aaa*aaa*aaa==i){
    			System.out.println(i+"��ˮ�ɻ���");
    		}
    	}
      
	}

}
