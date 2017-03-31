package chapter9;

import chapter9.item.DinerMenu;
import chapter9.item.MenuItem;
import chapter9.item.PancakeHouseMenu;
import chapter9.myinterface.Iterator;
import chapter9.myinterface.Menu;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu,Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		printMenu(pancakeHouseIterator);
		System.out.println();
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.getName()+" "+item.getDescription()+" "+item.getPrice());
		}
	}
	
}
