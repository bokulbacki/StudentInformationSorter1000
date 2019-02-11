import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradesChange
	{
		public static void GradeChange()
		{
			
			System.out.println("Which student's grades would you like to change?");
			PrintStudents.printStudents();
			Scanner userInput = new Scanner(System.in);
			int changes = userInput.nextInt();
			
			System.out.println("You chose " + SISRunner.students.get(changes-1).getFirstName()+".");
			
			System.out.println("Which period would you like to change?");
			Scanner userInput1 = new Scanner(System.in);
			int period = userInput1.nextInt();
			System.out.println("What do you want the new grade to be?");
			Scanner userInput2 = new Scanner(System.in);
			String grades = userInput2.nextLine();
			
			if(period == 1)
			   {
				    
				    SISRunner.students.get(changes-1).setGrade1(grades);
			   }
			else if(period == 2)
				{
					SISRunner.students.get(changes-1).setGrade2(grades);
				}
			else if(period == 3)
				{
					SISRunner.students.get(changes-1).setGrade3(grades);
				}
			
			System.out.println("You just changed " + SISRunner.students.get(changes-1).getFirstName() +  "'s "+ "period " + period + " grade.");
			SetGPA.setGPA();
			PrintStudents.printStudents();	
		}
		
		public static void scheduleChange()
		{
			System.out.println("Which student's schedule would you like to change?");
			PrintStudents.printStudents();
			Scanner userInput = new Scanner(System.in);
			int changes = userInput.nextInt();
			
			System.out.println("You chose " + SISRunner.students.get(changes-1).getFirstName()+".");
			
			System.out.println("Which period would you like to change?");
			Scanner userInput1 = new Scanner(System.in);
			int period = userInput1.nextInt();
			System.out.println("What do you want the new class to be?");
			Scanner userInput2 = new Scanner(System.in);
			String grades = userInput2.nextLine();
			System.out.println("Please input the grade for " + grades + " class.");
			String newClassGrade = userInput2.nextLine();
			if(period == 1)
			   {
				    
				    SISRunner.students.get(changes-1).setPeriod1(grades);
				    SISRunner.students.get(changes-1).setGrade1(newClassGrade);
			   }
			else if(period == 2)
				{
					SISRunner.students.get(changes-1).setPeriod2(grades);
					SISRunner.students.get(changes-1).setGrade2(newClassGrade);
				}
			else if(period == 3)
				{
					SISRunner.students.get(changes-1).setPeriod3(grades);
					SISRunner.students.get(changes-1).setGrade3(newClassGrade);
				}
			
			System.out.println("You just changed " + SISRunner.students.get(changes-1).getFirstName() +  "'s "+ "period " + period);
			SetGPA.setGPA();
			PrintStudents.printStudents();
		}

	}
