package cse360assignment02;

public class AddingMachine 
{
	private int total;
	private String math = "";
	private int itotal = 0;
	  
	  public AddingMachine () {
	    //total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () {
	    return 0;
	  }
	  
	  public void add (int value) {
		  total += value;
		  math += " + " + value ;
	  }

	  public void subtract (int value) {
		  total -= value;
		  math += " - " + value ;
	  }

	  public String toString () {
	    return itotal + math;
	  }

	  public void clear() {
		  total = 0;
	  }
}
