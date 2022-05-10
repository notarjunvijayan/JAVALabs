import java.util.Scanner;

public class student
{
	public static void main(String[] args)
	{
		//Input
		System.out.print("Enter name: ");
		Scanner n = new Scanner(System.in);
		String fName = n.next();
		String lName = n.next();
		
		System.out.print("Enter Roll no: ");
		Scanner r = new Scanner(System.in);
		int rollNo = r.nextInt();
		
		//Output
		System.out.println("Name: " + fName +" " + lName);
		System.out.println("Rollno: " + rollNo);
	}
}