package strategy;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我的脖子是绿色的");

	}

	public MallardDuck() {
		super();
		super.setFlayStrategy(new FlayWithWin());
		// TODO Auto-generated constructor stub
	}
    
}
