package chapter9;

import chapter9.item.DinerMenu;
import chapter9.item.PancakeHouseMenu;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
		waitress.printMenu();
	}

}
