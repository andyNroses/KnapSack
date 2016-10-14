public class Item {

	private int id;
	private int weight;
	private int benefit;

	public Item(int i, int b, int w) {
		this.id = i;
		this.setBenefit(b);
		this.setWeight(w);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBenefit() {
		return benefit;
	}

	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "x" + id;
	}

}
