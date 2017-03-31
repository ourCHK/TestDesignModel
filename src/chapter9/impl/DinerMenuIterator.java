package chapter9.impl;

import chapter9.item.DinerMenu;
import chapter9.item.MenuItem;
import chapter9.myinterface.Iterator;

public class DinerMenuIterator implements Iterator{
	
	MenuItem[] menuItems;
	int position = 0;
	
	public DinerMenuIterator(DinerMenu menu) {
		menuItems = menu.getMenuItems();
		
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position < menuItems.length && menuItems[position] != null)
			return true;
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return menuItems[position++];
	}
}
