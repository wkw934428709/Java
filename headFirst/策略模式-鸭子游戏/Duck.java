public abstract class Duck {	FlyBehavior flyBehavior;	QuackBehavior quackBehavior;	public Duck() {		// swim();		disPlay();	}	public void setQuackBehavior(QuackBehavior qb) {		quackBehavior = qb;	}	public void setFlyBehavior(FlyBehavior fb) {		flyBehavior = fb;	}	public void swim() {		System.out.println(" I can swim !");	}	public abstract void disPlay(); 	public void performFly() {		flyBehavior.fly();	}	public void performQuack() {		quackBehavior.quack();	}}