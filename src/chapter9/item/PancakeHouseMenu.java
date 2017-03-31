package chapter9.item;

import java.util.ArrayList;

import chapter9.impl.PancakeHouseMenuIterator;
import chapter9.myinterface.Iterator;
import chapter9.myinterface.Menu;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();
		addItem("the first","pancakeHouse's first",false,10);
		addItem("the second","pancakeHouse's second",true,20);
		addItem("the third","pancakeHouse's third",false,39);
		addItem("the fourth","pancakeHouse's fourth",true,50);
	}
	
	public void addItem(String name,String description,boolean vegetarian,double price) {
		MenuItem menuItem = new MenuItem();
		menuItem.setName(name);
		menuItem.setDescription(description);
		menuItem.setVegetarian(vegetarian);
		menuItem.setPrice(price);
		menuItems.add(menuItem);
	}
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(this);
	}

}
