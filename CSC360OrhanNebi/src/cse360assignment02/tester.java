package cse360assignment02;

import cse360assignment02.*;

public class tester {

	public static void main(String[] args)
	{
		AddingMachine tester = new AddingMachine();
		
		tester.add(4);
		tester.subtract(2);
		tester.add(5);
		
		System.out.println(tester.toString());
		
		tester.clear();
		
		
	}
}
