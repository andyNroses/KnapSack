public class Decision {

	private Item item;
	private boolean chosen;

	public Decision(Item i, boolean c) {
		this.setItem(i);
		this.setChosen(c);
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public boolean isChosen() {
		return chosen;
	}

	public void setChosen(boolean chosen) {
		this.chosen = chosen;
	}

	public String toString() {
		String output = this.item.toString();
		if (this.chosen) {
			output += " has been chosen";
		} else {
			output += " has not been chosen";
		}
		return output;
	}
}
