public class Bag {

	private int capacity;
	private int bound;
	
	public Bag (int c, int b) {
		this.setCapacity(c);
		this.bound = b;
	}
	
	public int getBound() {
		return this.bound;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
