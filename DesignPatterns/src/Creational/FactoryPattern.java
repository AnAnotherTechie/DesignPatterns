package Creational;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating abstract class or Interface to have the main functionality to create instances of class. 
		//And the classes can extend and implement the functions. The subclass can create objects on its own wish.
		//It offers loose Coupling to users
		
		abstract class CalculateMarks{
			
			abstract long calculateSum(List<Integer> scoreList);
			abstract long calculateAvg(long sum, int noOfSubjects);}
		
		class Student extends CalculateMarks
		{
			List<Integer> obj;
			Student(List<Integer> listOfMarks){
				obj=listOfMarks;
			}
			
			long calculateSum(List<Integer> scoreList) {
				
				//scoreList.stream().collect(Collectors.summingLong(Long::longValue));
				return scoreList.stream().reduce(0, (a, b) -> a + b);
				
				
			};
			
			long calculateAvg(long sum, int NoOfSubjects) {
				
				return sum/NoOfSubjects;
			};
			
		}
		
		class TypeOfStudent
		{
			TypeOfStudent(String typeOfStud,List<Integer> scoreList)
			{
				if(typeOfStud.equalsIgnoreCase("FirstYear"))
				{
					Student stuObj=new Student(scoreList);
					System.out.println("Sum of all subjects for FirstYear: "+stuObj.calculateSum(scoreList));
					System.out.println("Average score : "+ stuObj.calculateAvg(stuObj.calculateSum(scoreList), 5));
				}
				

				if(typeOfStud.equalsIgnoreCase("SecondYear"))
				{
					Student stuObj=new Student(scoreList);
					System.out.println("Sum of all subjects for SecondYear: "+stuObj.calculateSum(scoreList));
					System.out.println("Average score : "+ stuObj.calculateAvg(stuObj.calculateSum(scoreList), 5));
				}
			}
		}
		List<Integer> scoreList=new ArrayList<>(Arrays.asList(67,89,90,57));
		TypeOfStudent firstYear=new TypeOfStudent("FirstYear", scoreList);
		
		TypeOfStudent secondYear=new TypeOfStudent("SecondYear", Arrays.asList(69,77,89,90,57));
		
		
	}

}
