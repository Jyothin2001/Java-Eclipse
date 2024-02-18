package com.xworkz.things.example;

public class Fan 
{
	    public String speed;
	    public boolean clockwise;
	    public String color;
	    public boolean powerOn;
	    public String bladeMaterial;
	    public byte size;
	    
	    public Fan()
		 {
			  System.out.println("no argument Fan");
		 }
		
		@Override
		public String toString() 
		{
			
			return "color:" +this.color + "    ,size: "+this.size + "     ,clockwise: "+this.clockwise + ",      speed: "+this.speed +",  bladeMaterial: "+this.bladeMaterial+"   powerOn:"+this.powerOn;
		}

		
		@Override
		public boolean equals(Object obj) 
		{
			
			
			if(obj!=null && obj instanceof Fan)
			{
				
				Fan fans=(Fan)obj;
				
				if(this.clockwise==fans.clockwise && this.powerOn==fans.powerOn && this.bladeMaterial.equals(fans.bladeMaterial))
				{
					System.out.println("equals in:"+obj);
					System.out.println("Fan are same ");
					return true;
				}
			}
			System.out.println("equals in:"+obj);
			System.out.println("not same");
			
			return false;
		}


}
