package strategy;

public class YellowDuck extends Duck {
	@Override
	public void display() {
		System.out.println("����С��Ѽ");
     
	}

	public YellowDuck() {
		super();
		super.setFlayStrategy(new FlayWithOutWin());
		// TODO Auto-generated constructor stub
	}
}
