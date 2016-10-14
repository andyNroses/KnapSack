import java.util.ArrayList;

public class Node {
	
	private int currentBenefit;
	private int currentWeight;
	private ArrayList<Decision> decisions;
	
	public Node (int cB, int cW) {
		this.setCurrentBenefit(cB);
		this.setCurrentWeight(cW);
		this.decisions = new ArrayList<Decision>();
	}

	public int getCurrentBenefit() {
		return currentBenefit;
	}

	public void setCurrentBenefit(int currentBenefit) {
		this.currentBenefit = currentBenefit;
	}

	public int getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
	}
	
	public void addDecision(Item i, boolean c) {
		this.decisions.add(new Decision(i, c));
	}
	
	public void addDecisions(ArrayList<Decision> d) {
		this.decisions.addAll(d);
	}
	
	public ArrayList<Decision> getDecisions() {
		return this.decisions;
	}
	
	public void print() {
		System.out.println("Benefit: " + this.getCurrentBenefit());
		System.out.println("Weight: " + this.getCurrentWeight());
		System.out.println("----------------------");
		for (Decision d : this.decisions) {
			System.out.println(d);
		}
	}
	
}
