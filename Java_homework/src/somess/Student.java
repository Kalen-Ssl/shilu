package somess;


//��дһ����Student������ӵ�����ԣ�У����ѧ�š��Ա𡢳������ڡ�
//�����������������ͳɼ���setName������serScore���������ٱ�дStudent��
//����Undergraduate����ѧ������Undergraduate���ӵ�и�����������Ժͷ����⣬
//��ӵ�и��ӵ����Ժͷ��������԰���ϵ��department����רҵ��major����
//������������ϵ���רҵ��setDepartment������setMajor������

public class Student {
	String name;
	int studentNo;
	int score;
	String sex;
	String data;
	String school;
	public void setName(String name){
		this.name=name;
	}
	public void setScore(int score){
		this.score=score;
	}
	
	
	 public static void main(String[] args){
		    Undergraduate student1=new Undergraduate();
			student1.school="�����ƾ���ѧ";
			student1.studentNo=1705990425;
			student1.sex="Ů";
			student1.data="1997-4-4";
			student1.name="ʷ��";
			student1.score=80;
			student1.department="�����";
			student1.major="�������";
			System.out.println("����:"+student1.name+"\n"+"��������"+student1.data+"\n"
			 +"�Ա�"+student1.sex+"\n"+"������"+student1.score+"\n"+"ϵ��"+student1.department+"\n"
			 +"רҵ��"+student1.major+"\n");
			student1.setName("ʷ�");
			student1.setScore(85);
			student1.setDepartment("�������");
			student1.setMajor("�������רҵ");
			System.out.println("����:"+student1.name+"\n"+"��������"+student1.data+"\n"
			 +"�Ա�"+student1.sex+"\n"+"������"+student1.score+"\n"+"ϵ��"+student1.department+"\n"
			 +"רҵ��"+student1.major+"\n");
	 }

	
	
}



//department����רҵ��major����
//������������ϵ���רҵ��setDepartment������setMajor������
 class Undergraduate extends Student{
	  String department;
	  String major;
	  void setMajor(String major){
		  this.major=major;
	  }
	  void setDepartment(String department){
		  this.department=department;
	  }
 }
 
 

 
 
 
 
 