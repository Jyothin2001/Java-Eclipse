package com.xworkz.streamRunner;

import java.util.Collection;

import com.xworkz.stream.RubberDTO;

public class RubberDTORunner {

	public static void main(String[] args) 
	{
		Collection<RubberDTO> rubber=RubberDTO.rubber();
		
		rubber.stream().sorted().forEach(e->System.out.println(e));
		
		System.out.println("============================================");
		
		rubber.stream().filter(f->f.getColor().contains("Blue")).forEach(e->System.out.println(e));

	}

}

