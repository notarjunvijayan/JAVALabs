import java.util.Scanner;
import java.io.*;

class Person{
	String name;
	int age,total;
	String gender,grade;
	int mark1,mark2,mark3;

	Person(){
	System.out.print("Enter name: ");
	Scanner b = new Scanner(System.in);
	name = b.next();

	System.out.print("Enter age: ");
	Scanner c = new Scanner(System.in);
	age = c.nextInt();
	
	System.out.print("Enter gender: ");
	Scanner d = new Scanner(System.in);
	gender = d.next();

	System.out.print("Enter mark1: ");
	Scanner e = new Scanner(System.in);
	mark1 = e.nextInt();

	System.out.print("Enter mark2: ");
	Scanner f = new Scanner(System.in);
	mark2 = f.nextInt();

	System.out.print("Enter mark3: ");
	Scanner g = new Scanner(System.in);
	mark3 = g.nextInt();

	total = mark1 + mark2 + mark3;
	if(total > 270)
	{
	grade = "A";
	}
	else if(total > 240)
	{
	grade = "B";
	}
	else if(total > 210)
	{
	grade = "C";
	}
	else if(total > 180)
	{
	grade = "D";
	}

	}
}
class Student extends Person{
void display(){
	System.out.println("///////////////////////////////////");
	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
	System.out.println("Gender: " + gender);
	System.out.println("Total marks: " + total);
	System.out.print("Grade: " + grade);
}
public static void main(String args[]){
	System.out.print("Enter number of students: ");
	Scanner a = new Scanner(System.in);
	int n = a.nextInt();

	Student o[] = new Student[n];
	int i;
	for(i=0;i<n;i++)
	{
	o[i] = new Student();
	}
	int j;
	for(j=0;j<n;j++)
	{
	o[j].display();
	}
}	
}