package CarDrive;


public class Driver implements IDriver{
	public void drive(ICar car){
		car.run();
	}
}
