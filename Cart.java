package week2;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20 ;
	private DigitalVideoDisc itemsOrdered[]=  new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered ; 
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered != 20) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++ ;
			System.out.println("Done");
		}
		else {
			System.out.println("Err !!!");
		}
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].getTitle() == disc.getTitle()) {
				for(int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				i--;
				qtyOrdered--;
				System.out.println("The disc has been removed");
			}
		}
	}
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	
}
