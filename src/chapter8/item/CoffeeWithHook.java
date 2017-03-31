package chapter8.item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding sugar and Milk to the Coffee!\n");
	}

	@Override
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		String answer = getUserInput();
		if(answer.equalsIgnoreCase("y")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with you coffee(y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO error trying to read you answer");
		}
		
		if(answer == null) {
			return "no";
		}
		return answer;
		
	}
	
	

}
