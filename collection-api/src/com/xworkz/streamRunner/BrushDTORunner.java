package com.xworkz.streamRunner;

import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.BrushDTO;

public class BrushDTORunner 
{
	public static void main(String[] args)
	{
		Collection<BrushDTO> brush=BrushDTO.brush();
		
		//to compare elements or reference we use comparable(param1) and comparator(param1,param2)
		
		
		brush.stream().sorted().forEach(a->System.out.println(a));
		

		brush.stream()
		.sorted()
		.filter(ref->ref.getPrice()>50).collect(Collectors.toList())
		.forEach(a->System.out.println(a));                        //use stream to reduce code lines,methods.
		

		
		
	}
}
