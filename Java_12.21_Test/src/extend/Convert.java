package extend;

class CA{
	String s="class CA";
}
class CB extends CA{
	String s="class CB";
}

 class Convert {
	 public static void main(String[] args){
		 CB bb,b=new CB();
		 CA a,aa;
		 a=(CA)b;   //��ʽת��
		 aa=b;      //��ʽת��
		 System.out.println(a.s);
		 System.out.println(aa.s);
		 bb=(CB)a;
		 System.out.println(bb.s);
	 }
}
