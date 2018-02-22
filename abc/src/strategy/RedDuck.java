package strategy;

public class RedDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我的脖子是红色的");
     
	}

	public RedDuck() {
		super();
		super.setFlayStrategy(new FlayWithWin());
		// TODO Auto-generated constructor stub
	}
    
}
