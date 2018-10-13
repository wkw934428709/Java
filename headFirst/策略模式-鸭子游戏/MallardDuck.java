
public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlywithWings();
	}
	
	public void disPlay() {
		System.out.println(" am green duck!");
	}
}