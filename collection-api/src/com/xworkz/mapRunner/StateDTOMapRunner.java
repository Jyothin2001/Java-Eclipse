package com.xworkz.mapRunner;
import java.util.Collection;

import com.xworkz.complexdto.map.Direction;
import com.xworkz.complexdto.map.StateDTO;
import com.xworkz.complexdto.map.StateDTOInit;

public class StateDTOMapRunner 
{

	public static void main(String[] args) 
	{

	       Collection<StateDTO> state=StateDTOInit.run();
	       
	       System.out.println("--------------1.default by state name asc-----------");
	       
	       //state.stream().sorted().forEach(a->System.out.println(a));
	       
	       System.out.println("--------------2.Sort all states by name in desc-----------");
	       
//	       state
//	       .stream()
//	       .sorted((a,b)->b.getName().compareToIgnoreCase(a.getName()))
//	       .forEach(a->System.out.println(a));
//	       
	       System.out.println("--------------3.get all states by each direction*4-----------");
	       
//	       state
//	       .stream()
//	       .filter(b->b.getDirection().equals(Direction.NORTH))
//	       .forEach(a->System.out.println(a));
//	       
//	       System.out.println("-----------------------------------------------------------");
//	       state
//	       .stream()
//	       .filter(b->b.getDirection().equals(Direction.SOUTH))
//	       .forEach(a->System.out.println(a));
//	       
//	       System.out.println("-----------------------------------------------------------");
//	       
//	       state
//	       .stream()
//	       .filter(b->b.getDirection().equals(Direction.EAST))
//	       .forEach(a->System.out.println(a));
//	       
//	       System.out.println("-----------------------------------------------------------");
//	       
//	       state
//	       .stream()
//	       .filter(b->b.getDirection().equals(Direction.WEST))
//	       .forEach(a->System.out.println(a));
//	       
	       
	       System.out.println("--------------4.get all population only by asc -----------");
	       
	       
//	       state.stream()    //filter-boolean, map-string
//	       .map(b->b.getPopulation()) //gives string so NO getMethod()
//	       .sorted((a,b)->a.compareTo(b))
//	       .forEach(a->System.out.println(a));
//	       
	       System.out.println("--------------5.get population only by state name-----------");
	       
	       
//	       state.stream()
//	       .filter(b->b.getName().equalsIgnoreCase("Jharkhand"))
//	       .map(c->c.getPopulation())
//	       .forEach(a->System.out.println(a));
//	       
	       System.out.println("--------------6.get chieftMinsiter name by state name-----------");
	       
//	       state.stream()
//	       .filter(stateName->stateName.getName().equalsIgnoreCase("manipur"))
//	       .map(minister->minister.getChiefMinister())
//	       .forEach(a->System.out.println(a));
	       
	       System.out.println("--------------(7).get state with max budget-----------");
	       

//		   state
//		   .stream()
//	       .map(stateName->stateName.getBudget() Long.MAX_VALUE)
//	       .forEach(a->System.out.println(a));
//	       
	       
	       System.out.println("--------------(8).get state with min budget -----------");
	       
//	       wCollection<StateDTO> state1= state.stream()
//		   .max((a,b)->a.getBudget()).get();
//	       
	       
	       System.out.println("--------------9.get state with second max budget-----------");
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       System.out.println("--------------10.get all by revenue greater than 10 -----------");

//	       state.stream().filter(a->a.getRevenue()>10)
//	       .forEach(a->System.out.println(a));
//	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
//		       // Fix default sorting by name asc
//		        System.out.println("*1*");
//
//		       stateCollection
//		       .stream() 
//		       .sorted()
//		       .forEach(name->System.out.println(name));
//		       
//		       //Sort all states by name in desc 
//		       System.out.println("*2*");
//		       stateCollection
//		       .stream()
//		       .sorted((n1,n2)->n2.getName().compareTo(n1.getName()))
//		       .forEach(name->System.out.println(name));
//
//		       //get all states by each direction*4
//		       System.out.println("*3*");
//
//		       //get all population only by asc
//		       System.out.println("*4*");
//		       
//		       stateCollection
//		       .stream()
//		       .map(p->p.getPopulation())
//		       .sorted((p1,p2)->p1.compareTo(p2))
//		       .forEach(p->System.out.println(p));
//
//		       
//		       
//		       //get population only by state name 
//		       System.out.println("*5*");
//		stateCollection
//		.stream()
//		.filter(state -> state.getName().equals("Karnataka"))
//		.map(s->s.getPopulation()) 
//		.forEach(t->System.out.println(t));
//
//		//get chieftMinsiter name by state name 
//		System.out.println("*6*");
//
//		stateCollection
//		.stream()
//		.filter(c->c.getName().equals("Karnataka"))
//		.map(name->name.getChiefMinister())
//		.forEach(name->System.out.println(name));
//
//
//
//		//get state with max budget
//		//System.out.println("*7*");
//		//
//		//stateCollection
//		//.stream()
//		//.max(Comparator.comparingDouble().getClass())
//		//.fo
//		//
//		//.stream()
//		//.sorted()
//		//.max(Comparators.to)



		//.collect(Collectors.toList())




		//get all by revenue greater than 10  
//		System.out.println("*10*");
//
//		stateCollection
//		.stream()
//		.filter(rev->rev.getRevenue()>10)
//		.forEach(revenue->System.out.println(revenue));



			}

		


	}


