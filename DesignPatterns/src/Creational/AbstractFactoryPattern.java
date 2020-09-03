package Creational;

import java.util.List;

/*Creational design patterns are concerned with the way of creating objects.
 * Normal approach we using new keyboard to create objects. 
 * To reduce that hard coded things we are going to creastional design patterns */



//Here interface and abstract class are created inside a seperate class. 
//and other concrete classes extends it and use it
public class AbstractFactoryPattern {

	interface AverageMarks
	{
		long calculateAvg(long sum, int noOfSubjects);
	}
	public void main(String args[])
	{
		abstract class SumMarks{
			
			abstract long calculateSum(List<Integer> scoreList);
		}
		
		abstract class calculateMarks
		{
			abstract AverageMarks getAverage();
			abstract SumMarks getSumMarks();
			
		}
		
		
	}
		
		
	}
	
	

