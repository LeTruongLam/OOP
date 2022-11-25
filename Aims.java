package week2;

public class Aims {
	public static void main(String[] args) {
Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 23.66f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Tay DU ky", "Hanh dong", 18.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Anime", "Hoat Hinh", 8.19f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Avatar", "Khoa hoc vien tuong", 33.12f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd5);
		anOrder.addDigitalVideoDisc(dvd6);
		anOrder.removeDigitalVideoDisc(dvd3);
		
		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());
	}
}
