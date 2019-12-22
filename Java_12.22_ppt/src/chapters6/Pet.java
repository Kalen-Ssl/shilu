package chapters6;

public interface Pet {
    public void play();
    public void eat();
}

class Dogss implements Pet{

	public void play() {
          System.out.println("Dog playing");
	}

	public void eat() {
          System.out.println("Dog eating");
	}
}

