package chapter9_part2;


import chapter9_part2.item.Menu;
import chapter9_part2.item.MenuComponent;
import chapter9_part2.item.MenuItem;

public class TestComposite {
	
	public static void main(String[] args) {
		MenuComponent menu1 = new Menu("Pancake Menu","breakfast");
		MenuComponent menu2 = new Menu("Diner Menu","lunch");
		MenuComponent menu3 = new Menu("Cafe Menu","dinner");
		MenuComponent menu4 = new Menu("dessert Menu","dessert");
				
		MenuComponent allMenus = new Menu("ALL MENUS","all menus combined");
		menu1.add(new MenuItem("vegetable","the vegetable",true,2));
		menu1.add(new MenuItem("fish","the live fish",false,30));
		allMenus.add(menu1);
		allMenus.add(menu2);
		allMenus.add(menu3);
		
		
		
		menu4.add(new MenuItem("pasta","with bread",true,20));
		menu4.add(new MenuItem("meat","the meat",false,100));
		menu4.add(new MenuItem("pia", "apple pie", true,10));
		menu4.add(new MenuItem("candy","the fully cnady",false,7));
		
		allMenus.add(menu4);		
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenus();

		
	}
	
}
