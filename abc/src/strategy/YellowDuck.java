package strategy;

public class YellowDuck extends Duck {
	@Override
	public void display() {
		System.out.println("Œ“ «–°ª∆—º");
     
	}

	public YellowDuck() {
		super();
		super.setFlayStrategy(new FlayWithOutWin());
		// TODO Auto-generated constructor stub
	}
}
