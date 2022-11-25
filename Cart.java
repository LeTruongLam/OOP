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

	// tham so chuyen vao la 1 mang
		public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
			int i = 0;
			while(dvdList[i] != null) {
				itemsOrdered[qtyOrdered] = dvdList[i];
				++qtyOrdered;
				i++;
			}
		}

	// co 2 tham so truyen vao
		public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
			itemsOrdered[qtyOrdered] = dvd1;
			itemsOrdered[qtyOrdered+1] = dvd2;
			qtyOrdered = qtyOrdered + 2;
		}	
	
	
	
	
}
