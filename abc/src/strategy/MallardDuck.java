package strategy;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("�ҵĲ�������ɫ��");

	}

	public MallardDuck() {
		super();
		super.setFlayStrategy(new FlayWithWin());
		// TODO Auto-generated constructor stub
	}
    
}
