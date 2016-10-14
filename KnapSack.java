import java.util.ArrayList;

public class KnapSack {
	
	public static Node max = new Node(0, 0);

	public static void knapSack(Node node, ArrayList<Item> items, Bag bag) {
		
		ArrayList<Item> itemsCopy = new ArrayList<Item>();
		itemsCopy.addAll(items);
		
		if (itemsCopy.size() == 0) {
			if (node.getCurrentBenefit() >= max.getCurrentBenefit()) {
				max = node;
			}
		} else {	
			Node leftSon;
			Node rightSon;
			Item currentItem = itemsCopy.remove(0);
			
			if (node.getCurrentWeight() + currentItem.getWeight() <= bag.getCapacity() && node.getCurrentBenefit() + currentItem.getBenefit() <= bag.getBound()) {
				leftSon = new Node(node.getCurrentBenefit() + currentItem.getBenefit(), node.getCurrentWeight() + currentItem.getWeight());
				leftSon.addDecisions(node.getDecisions());
				leftSon.addDecision(currentItem, true);
				knapSack(leftSon, itemsCopy, bag);
			} else {
				if (node.getCurrentBenefit() >= max.getCurrentBenefit()) {
					max = node;
				}
			}
			
			rightSon = new Node(node.getCurrentBenefit(), node.getCurrentWeight());
			rightSon.addDecisions(node.getDecisions());
			rightSon.addDecision(currentItem, false);
			knapSack(rightSon, itemsCopy, bag);
		}
		
	}
	
	public static int getBound(ArrayList<Item> items, int maxWeight) {
       
		double [] benefits = new double[items.size()];
        double [] weights = new double[items.size()];
        
        for (int i = 0; i < items.size(); i++) {
        	benefits[i] = items.get(i).getBenefit();
        	weights[i] = items.get(i).getWeight();
        }
        
        return (int) Bound.calculate(benefits, weights, maxWeight);
        
	}
	
}
 