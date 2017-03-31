package chapter8.item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverageWithHook{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding lemon to the tea!\n");
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
	
	public String getUserInput() {
		String answer = null;
		System.out.println("Would you like to add lemon(y/n)?");
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			answer = bf.readLine();
		} catch (IOException e) {
			System.err.println("IOError trying to read your input");
		}
		
		if (null == answer) {
			return "no";
		}
		return answer;
	}
	
	

}
