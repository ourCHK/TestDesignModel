package chapter9_part2;

import chapter9_part2.item.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenus() {
		allMenus.print();
	}
}
