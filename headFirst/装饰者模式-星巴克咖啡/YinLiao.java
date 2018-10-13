
public abstract class YinLiao {
	
	String description;
	private int size;

	public String getDescription() {
		return ("Unknow description!");
	}

	public abstract double cost();

	public void setSize(int s) {
		size = s;
	}

	public int getSize() {
		return size;
	}
}