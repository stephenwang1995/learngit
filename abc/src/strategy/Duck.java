package strategy;

public abstract class Duck {
	public void quack() {
		System.out.println("¸Â¸Â¸Â");
	}

	public abstract void display();

	private FlayStrategy flayStrategy;
	public void setFlayStrategy(FlayStrategy flayStrategy) {
		this.flayStrategy = flayStrategy;
	}
     public void fly() {
    	 flayStrategy.Performfly();
	}
}
