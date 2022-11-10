package com.xworkz.Encapsulation.Inheritance;

public class BJP extends PoliticalParty {
	
	public String head;
	 
	 
	public BJP(String name, int members, String symbol,String head) {
		super(name, members, symbol);
		this.head=head;
		
	}
 public void display()
 {
	 super.display();       
	 
	 
	 System.out.println("party head name is  "+this.head);
 }

}
