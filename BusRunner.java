package com.xworkz.constructor;

import com.xworkz.constructor.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		System.out.println("entered");
		 
		 Bus srsTravells=new Bus();
		System.out.println("bus number:"+srsTravells.num);

		srsTravells.num=7604;	`
				System.out.println("bus number:"+srsTravells.num);
			
				srsTravells.startingPoint="tumkur";
				srsTravells.destination="banglore";
				
				
				System.out.println("startingPoint:"+srsTravells.startingPoint);
				System.out.println("destination:"+srsTravells.destination);
				
				System.out.println("going");
				
				System.out.println("updated bus details"); 
				
				srsTravells.num=8231;
				srsTravells.startingPoint="banglore";
				srsTravells.destination="madhugiri";
				
				
				System.out.println("bus number:"+srsTravells.num);
				System.out.println("startingPoint:"+srsTravells.startingPoint);
				System.out.println("destination:"+srsTravells.destination);
	}
}  
