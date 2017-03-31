package chapter8;

import java.util.Arrays;

import chapter8.item.Chicken;

public class TestChicken {
	public static void main(String[] args) {
		Chicken[] chickens = {
				new Chicken("CHK1",12),
				new Chicken("CHK2",23),
				new Chicken("CHK3",10),
				new Chicken("CHK4",16),
				new Chicken("CHK5",6)
		};
		System.out.println("Before sorting");
		display(chickens);
		
		Arrays.sort(chickens);
		System.out.println("\nAfter sorting");
		display(chickens);
		
	}
	
	
	public static void display(Chicken[] chickens) {
		for (int i=0; i<chickens.length; i++) {
			System.out.println(chickens[i]);
		}
	}
}
