package chapter9.impl;

import java.util.ArrayList;

import chapter9.item.MenuItem;
import chapter9.item.PancakeHouseMenu;
import chapter9.myinterface.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

	ArrayList<MenuItem> menuItems;
	int position = 0;
	
	public PancakeHouseMenuIterator(PancakeHouseMenu menu) {
		this.menuItems = menu.getMenuItems();
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position<menuItems.size()) 
			return true;
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return menuItems.get(position++);
	}

}
