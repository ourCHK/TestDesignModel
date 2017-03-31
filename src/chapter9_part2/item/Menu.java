package chapter9_part2.item;

import java.util.ArrayList;
import java.util.Iterator;

import chapter9_part2.impl.CompositeIterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	String description;
	
	
	
	public Menu( String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		super.remove(menuComponent);
	}
	
	@Override
	public void getChild(int i) {
		// TODO Auto-generated method stub
		super.getChild(i);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("\n"+getName());
		System.out.println(","+getDescription());
		System.out.println("----------------");
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			((MenuComponent) iterator.next()).print();
		}
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new CompositeIterator(menuComponents.iterator());
	}
	
	
	
	
}
