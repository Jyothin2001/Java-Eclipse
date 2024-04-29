package com.xworkz.streamRunner;

import java.util.Collection;

import com.xworkz.stream.DayDTO;

public class DayDTORunner {

	public static void main(String[] args)
	{
		Collection<DayDTO> day=DayDTO.day();
		
		day.stream().sorted().forEach(a->System.out.println(a));
		
			
	}

}
