package com.xworkz.things;

import com.xworkz.things.tostring.Mirror;

public class MirrorRunner {

	public static void main(String[] args) 
	{
		Mirror mirror =new Mirror("Polystyrene plastic",30000,(byte)48);
		System.out.println(mirror);
		System.out.println(mirror.hashCode());
		System.out.println(mirror.hashCode());
		
		Mirror mirror1 =new Mirror("Plastic foil",20000,(byte)38);
		System.out.println(mirror1);
		System.out.println(mirror1.hashCode());
		


	}

}
