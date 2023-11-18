package Assignment_2;

import java.util.Scanner;

public class Scanner_java {

	public static void main(String[] args) {
		
		Scanner ui1 = new Scanner(System.in);//for non primitive data type
        Scanner ui2 = new Scanner(System.in);//for primitive data type
	
	    System.out.println("What is your name?");
	    String name = ui1.nextLine();
	    
	    System.out.println("How old are you?");
        int age = ui2.nextInt();
        
        System.out.println("What is your gender?");
        String gender = ui1.nextLine();
        
        System.out.println("Where do you work?");
	    String companyName = ui1.nextLine();
	    
	    System.out.println("What is your job role?");
	    String jobTitle = ui1.nextLine();
	    
	    System.out.println("Where do you live now?");
	    String location =ui1.nextLine();
	    
	    System.out.println("Where are you from?");
        String location2 = ui1.nextLine();
	    
	    System.out.println("What is your salary?");
	    double salary = ui2.nextDouble();
	    
	    System.out.println("How much raise do you get?");
	    double raise = ui2.nextDouble();
	    
	    double totalSalary = salary+raise;
	    
	    System.out.println("My name is "+name+". I am "+age+" years old, "+gender+". I work at "+companyName+" as "+jobTitle+". I currently live in "+location+". I am originally from "+location2+". I make "+salary+" dollar. I will get "+raise+" as annual raise so my total salary would be "+totalSalary+" dollar next year.");
	
	}

}
