
public class Pet {
	private String name;//��Ա����
	private int health;
	private int love;
	
	public Pet() {
		// TODO Auto-generated constructor stub
		health=100;
		love=0;
	}//�޲ι��췽����Ĭ�Ͻ���ֵΪ100�����ܶ�Ϊ0
	
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}//�������������Ĺ��췽������ֱ�Ӹ���ֵ
	//set��get����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	//print�������Դ�ӡ���������
	public void print(){
		System.out.println("������԰�:");
		System.out.println("�ҵ����ֽ�"+name+",�ҵĽ���ֵ��"+health+",�Һ����˵����̶ܳ���"+love);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
