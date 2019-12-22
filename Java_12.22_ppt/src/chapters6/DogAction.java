package chapters6;

public interface DogAction {
   public void ww();
}

interface Pets{
	public void playss();
	public void eat();
}

class Cats implements Pets,DogAction{

	public void eat(){
		System.out.println("Dog eatiing");
	}
	public void ww(){
		System.out.println("wwing");
	}
	@Override
	public void playss() {
       System.out.println("dog play");
	}
}




