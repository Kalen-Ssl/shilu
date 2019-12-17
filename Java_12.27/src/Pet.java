
public class Pet {
	private String name;//成员变量
	private int health;
	private int love;
	
	public Pet() {
		// TODO Auto-generated constructor stub
		health=100;
		love=0;
	}//无参构造方法，默认健康值为100，亲密度为0
	
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}//带了三个参数的构造方法可以直接赋初值
	//set和get方法
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
	//print方法可以打印宠物的属性
	public void print(){
		System.out.println("宠物的自白:");
		System.out.println("我的名字叫"+name+",我的健康值是"+health+",我和主人的亲密程度是"+love);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
