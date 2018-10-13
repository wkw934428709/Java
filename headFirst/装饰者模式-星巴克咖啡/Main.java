
/*
装饰者模式
解决问题--> 类爆炸的情况
利用组合（装饰者即PeiLiao）和委托（同一类型即YinLiao），可以在运行时具有继承的效果
这里先想一想继承里父类和子类的关系，装饰者中用一个委托代替实现了类似父类的功能

**设计原则**
类应该对扩展开发，对修改关闭


*/

public class Main {
	public static void main(String[] args) {
		YinLiao yl = new Kafei();
		yl = new LongZhu(yl);
		yl = new NaiGai(yl);
		yl = new Moka(yl);
		yl.setSize(1);

		YinLiao yl2 = new Naicha();
		yl2 = new NaiGai(yl2);
		yl2 = new LongZhu(yl2);
		yl2.setSize(3);

		System.out.println(yl.getDescription() + " :: Cost= " + yl.cost());
		System.out.println(yl2.getDescription() + " :: Cost= " + yl2.cost());
	}
}