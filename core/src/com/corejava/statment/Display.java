package com.corejava.statment;

public interface Display 
{
	public void disp();
}

class Disp implements Display 
{
	public void disp() 
	{
		System.out.println("class disp mehtod");
	}
	
}

class F extends Disp
{
	
}

