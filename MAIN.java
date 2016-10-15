import java.util.ArrayList;

public class MAIN {

	public static void main(String args[]) {
		
		//Items
		Item i1 = new Item(1, 30, 6);
		Item i2 = new Item(2, 10, 13);
		Item i3 = new Item(3, 21, 1);
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(i1);
		items.add(i2);
		items.add(i3);
		
		//Bag
		Bag bag = new Bag(19, KnapSack.getBound(items, 19));
		
		//KnapSack
		KnapSack.knapSack(items, bag);
		KnapSack.max.print();
	}

}
