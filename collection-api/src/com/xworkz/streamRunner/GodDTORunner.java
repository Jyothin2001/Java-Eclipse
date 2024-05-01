package com.xworkz.streamRunner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.stream.GodDTO;

public class GodDTORunner 
{

	public static void main(String[] args) 
	{
		Collection<GodDTO> collection=new ArrayList<>();
		
		GodDTO god1=new GodDTO("Venkataramna", "Kailasa", "Male", "Kalabhairava", "Destroy EveryThing");

		GodDTO god2=new GodDTO("Vishnu", "Vaikunta", "Male", "Venkateshwara", "SudarshanaChakra");

		GodDTO god3=new GodDTO("Parvathi", "Kailasa", "Female", "Kempamma", "Nature");

		GodDTO god4=new GodDTO("Lakshmi", "Vaikunta", "female", "AdrustaLakshmi", "Rich");

		GodDTO god5=new GodDTO("Bramha", "Air", "Male", "bramha", "Creater");

		GodDTO god6=new GodDTO("Indra", "Air", "Male", "Indra", "Protect");

		GodDTO god7=new GodDTO("Saraswathi", "Kailasa", "female", "VidyaSarsaswathi", "Education");

		GodDTO god8=new GodDTO("Surya", "SuryaLokha", "Male", "Sun", "Brightness");

		GodDTO god9=new GodDTO("Ganga", "River", "female", "Water", "Give water to use");

		GodDTO god10=new GodDTO("Venkataramna", "Kailasa", "Male", "Venkateshwara","give vara");

		collection.add(god10);
		collection.add(god9);
		collection.add(god8);
		collection.add(god7);
		collection.add(god6);
		collection.add(god5);
		collection.add(god4);
		collection.add(god3);
		collection.add(god2);
		collection.add(god1);
		
		collection.stream().sorted().forEach(a->System.out.println(a));
		
		System.out.println("------");
		
		collection.stream()
		.sorted((ref1,ref2)->ref2.getPlace().compareTo(ref1.getPlace()))
		.forEach(a->System.out.println(a));
		
		System.out.println("------");
		
		collection.stream()
		.sorted((ref1,ref2)->ref1.getPlace().compareTo(ref2.getPlace()))
		.forEach(a->System.out.println(a));
		
		System.out.println("------");
		
		collection
		.stream()
		.filter(a->a.getGender().contains("Male"))
		.sorted((a,b)->b.getAvatar().compareTo(a.getAvatar()))
		.forEach(c->System.out.println(c));
		
		System.out.println("------");
		
		collection
		.stream()
		.filter(a->a.getGender().equalsIgnoreCase("female"))
		.sorted((a,b)->a.getAvatar().compareTo(b.getAvatar()))
		.forEach(c->System.out.println(c));
		
		System.out.println("------");
		
		collection.stream()
		.map(p->p.getPlace())
		.sorted((a,b)->b.compareTo(a)) //map return string so no need to getPlace() explicitly .because string ha no method compareTo()
		.forEach(c->System.out.println(c));
				
		System.out.println("------");
		
		collection
		.stream()
		.map(a->a.getSpecialPower())
		.sorted((a,b)->b.compareTo(a))
		.forEach(c->System.out.println(c));
		
		System.out.println("------");
		
		collection
		.stream()
		.filter(j->j.getGodName().equalsIgnoreCase("Venkataramna") && j.getPlace().equalsIgnoreCase("Kailasa"))
	    .map(p->p.getGodName())
		.forEach(c->System.out.println(c));
				
	}

}
