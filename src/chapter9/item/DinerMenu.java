package chapter9.item;

import chapter9.impl.DinerMenuIterator;
import chapter9.myinterface.Iterator;
import chapter9.myinterface.Menu;

public class DinerMenu implements Menu{
	static final int MAX_ITEMS = 5;
	MenuItem[] menuItems;
	int numberOfItems = 0;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("the first","DinerMenu's first",false,10);
		addItem("the second","DinerMenu's second",true,20);
		addItem("the third","DinerMenu's third",false,39);
		addItem("the fourth","DinerMenu's fourth",true,50);
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price) {
		MenuItem menuItem = new MenuItem();
		menuItem.setName(name);
		menuItem.setDescription(description);
		menuItem.setVegetarian(vegetarian);
		menuItem.setPrice(price);
		menuItems[numberOfItems++] = menuItem;
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(this);
	}
}
