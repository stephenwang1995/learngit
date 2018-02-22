package strategy;

public class Test {
     public static void main(String[] args) {
	      Duck duck = null;
	      duck=new RedDuck();
	      duck.display();
	      duck.quack();
	      duck.fly();
	      
	      duck=new YellowDuck();
	      duck.display();
	      duck.quack();
	      duck.fly();
	}
}
