
public class LongZhu extends PeiLiao {
	
	YinLiao yinLiao;

	public LongZhu(YinLiao yl) {
		yinLiao = yl;
	}

	public String getDescription() {
		return " LongZhu, " + yinLiao.getDescription();
	}

	public double cost() {
		double ex = 0;
		switch (getSize()) {
			case 1:
				ex = 0.01;
				break;
			case 2:
				ex = 0.03;
				break;
			case 3:
				ex = 0.05;
				break;
		}
		return 0.9 + ex + yinLiao.cost();
	}
}