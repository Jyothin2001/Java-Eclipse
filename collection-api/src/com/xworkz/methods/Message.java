package com.xworkz.methods;

import java.util.ArrayList;
import java.util.Collection;

public class Message 
{
public static  Collection<String> messageCollection()
{
	Collection<String> message=new ArrayList<String>();
	
	message.add("Collection is an interface!");
	message.add("Collections in Java are a fundamental aspect of the language");
	message.add("providing a framework for storing and manipulating groups of objects.");
	message.add("From basic data structures like lists, sets, and maps to more specialized implementations");
	message.add("Java's collection framework offers versatility and efficiency in managing data.");
	message.add("Whether you're iterating through elements, sorting, searching, or performing complex operations,");
	message.add("understanding and utilizing Java's collections effectively is essential for building robust and scalable applications.");
	message.add("A collection represents a group of objects, known as its elements?.");
	message.add("Some collections allow duplicate elements & others do not.");
	message.add("ordered and others unordered.");
	
	return message;
	
}
}


/*
 * The root interface in the collection hierarchy. //A collection represents a
 * group of objects, known as its elements. //Some collections allow duplicate
 * elements and others do not. //Some are ordered and others unordered. //The
 * JDK does not provide any direct implementations of this interface: // it
 * provides implementations of more specific subinterfaces like Set and List. //
 * This interface is typically used to pass collections around and manipulate
 * them where maximum generality is desired.
 */




