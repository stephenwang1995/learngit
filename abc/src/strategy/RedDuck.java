package strategy;

public class RedDuck extends Duck {

	@Override
	public void display() {
		System.out.println("�ҵĲ����Ǻ�ɫ��");
     
	}

	public RedDuck() {
		super();
		super.setFlayStrategy(new FlayWithWin());
		// TODO Auto-generated constructor stub
	}
    
}
