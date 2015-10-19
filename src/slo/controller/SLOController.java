package slo.controller;

import slo.view.PopupDisplay;

public class SLOController
{
	private PopupDisplay myPopups;
	
	public SLOController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{			
		String temp = myPopups.grabAnswer("Type in the grade that you are in.");
		int myGrade;
		
		while(!isInteger(temp))
		{
			temp = myPopups.grabAnswer("Type in a positive integer for your grade.");
		}
		
		if(isInteger(temp))
		{
			myGrade = Integer.parseInt(temp);
		}
		
		else
		{
			myGrade = -999999;
		}
		
		myPopups.showResponse("You typed in:  " + temp + " grade.");
	
		
		String tempGPA = myPopups.grabAnswer("Type in your GPA.");
		double myGPA;
		
		while(!isDouble(tempGPA))
		{
			tempGPA = myPopups.grabAnswer("Type in a positive integer for your GPA.");
		}
		
		if(isDouble(tempGPA))
		{
			myGPA = Double.parseDouble(tempGPA);
		}
		
		else
		{
			myGPA = -.99;
		}
		
		myPopups.showResponse("You typed in:  " + myGPA);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double tmepGPA = Double.parseDouble(input);
			isDouble = true;
		}
		
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a double - bad vallue will be used");
		}
		
		return isDouble;
	}

}
