package com.xworkz.constructor;
import com.xworkz.constructor.choclate;

public class choclateRunner{
	public static void main(String []args){
		
		choclate chak=	new choclate ();
		
		 System.out.println("entered ");
		 
		chak.brand="cadbury";
		chak.flavour="strawberry";
		chak.name="sweet cadb Bury";
		chak.price=200;
		
		 
		System.out.println("brand  :"+chak.brand);
		System.out.println("flavour :"+chak.flavour);
		System.out.println("name :"+chak.name);
		System.out.println("price  :"+chak.price);
		
		System.out.println("*******************");
		System.out.println("updating details");
		
		chak.brand="still not eregistered";
		chak.flavour="orange";
		chak.name="pepparamentu";
		chak.price=1;
		
		
		System.out.println("brand  :"+chak.brand);
		System.out.println("flavour :"+chak.flavour);
		System.out.println("name :"+chak.name);
		System.out.println("price in rupees :"+chak.price);
		
		
	
	
}
	
	
	
	
	}

