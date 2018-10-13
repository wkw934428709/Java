
public class NaiGai extends PeiLiao {
	
	YinLiao yinLiao;

	public NaiGai(YinLiao yl) {
		yinLiao = yl;
	}

	public String getDescription() {
		return " NaiGai, " + yinLiao.getDescription();
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
		return 0.5 + ex + yinLiao.cost();
	}
}