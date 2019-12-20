package CarDrive;



public class Client {
	public static void main(String[] args){
		IDriver ZhangSan=new Driver();
		ICar benz=new Benz();
		ZhangSan.drive(benz);
		ICar bmw=new BWM();
		ZhangSan.drive(bmw);
	}
}
