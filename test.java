1)The covariant method overriding approach, implemented in Java 5,
 helps to remove the client-side typecasting by enabling you to return a subtype of the overridden method’s actual return type.
Covariant Method overriding means that when overriding a method in the child class, the return type may vary

***************************************************************************************************


9)A Memory Leak is a situation where there are objects present in the heap that are no longer used, 
but the garbage collector is unable to remove them from memory, and therefore, they're unnecessarily maintained.
 A memory leak is bad because it blocks memory resources and degrades system performance over time.


***************************************************************************************************



2) difference btw Linkedlist and ArrayList
           LinkedList    		                                                 ArrayList
* internally it stores in array form		                           * internally it stores in a circular node form
*it is easy to read and create operation                               * it is not easy to read and create operation
*ArrayList internally uses a dynamic array to store the elements       *LinkedList internally uses a doubly linked list to store the elements.

**********************************************************************************************

1)

package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public  class maxMinRunner {
public static void main (String[]args) {

	Collection<Integer> coll=new ArrayList<Integer>();
	coll.add(45);
	coll.add(333);
	coll.add(76);
	coll.add(29);
	coll.add(900);
	coll.add(23);
	coll.add(474);
	coll.add(654);
	coll.add(29);
	coll.add(454);
	System.out.println("max-"+Collections.max(coll));
	System.out.println("min-"+Collections.min(coll));
}
}
*****************************************************************************************************

3)
GRNERALIZATION CLASS ----------------- Converting a child type into a paraent type is called "Geeneralization"
 because we are making the subclass to become more general and its scope is wedening. this is also called widening or up class
 
SPECIALIZED CLASS --------------------- Converting parent type to child type is called SPECIALIZED CLASS
*************************************************************************************************************


10)
static polymorphism- it is type of polymorphism that collects information to call the method during compile time is called ststic polymorphism

Dynamic polymorphism- it is the type of polymorphism that collects information to call the method during run time is called Dynamic polymorphism
********************************************************************************************************************************

11)
By using encapuslation she can achieve to give a security for the properties 
encapuslation means hiding direct acces to properties and acces is done through methods.
in encapuslation we can  make properties as private and we can acess the properties through getmethod and setmethod 
***********************************************************************************


5)
comparable and comparater has used to  sort collection 
*****************************************************************************************************









