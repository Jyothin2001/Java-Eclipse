package com.xworkz.stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class DayDTO implements Serializable,Comparable<DayDTO>
{
	private static final long serialVersionUID = 1L;
	
private String name;
private Integer order;

public DayDTO()
{
	System.out.println("no arg");
}
public DayDTO(String name,Integer order)
{
	this.name=name;
	this.order=order;
}

public static  Collection<DayDTO> day()
{
	
	Collection<DayDTO> collection=new ArrayList<DayDTO>();
	
	
	DayDTO day1=new DayDTO("Monday", 1);
	DayDTO day2=new DayDTO("Tuesday", 2);
	DayDTO day3=new DayDTO("Wednesday", 3);
	DayDTO day4=new DayDTO("Thursday", 4);
	DayDTO day5=new DayDTO("Friday", 5);
	DayDTO day6=new DayDTO("Saturday", 6);
	DayDTO day7=new DayDTO("Sunday", 7);

    collection.add(day1);
    collection.add(day2);
    collection.add(day3);
    collection.add(day4);
    collection.add(day5);
    collection.add(day6);
    collection.add(day7);
	
	return collection;
	
}
@Override
public String toString() {
	return "DayDTO [name=" + name + ", order=" + order + "]";
}



@Override
public int compareTo(DayDTO o)
{
	return this.order.compareTo(o.order);

}

public void setName(String s)
{
	this.name=s;
}

public String getName()
{
	return name;
}

public void setOrder(Integer i)
{
	this.order=i;
}
public Integer getOrder()
{
	return order;
}

}
