import java.util.Scanner;

public class largest
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in); 
		System.out.print("Enter number 1,2,3 seperated with spaces: ");
		int num1 = a.nextInt();
		int num2 = a.nextInt();
		int num3 = a.nextInt();
		
		System.out.println("Numbers are: " + " " + num1 +" "+  num2 + " " + num3);
		int largest;
		if(num1 == num2)
		{
			if(num3 == num2)
			{
				largest = num1;
			}
			else if(num2 < num3)
			{
				largest = num3;
			}
			else
			{
				largest = num2;
			}
		}
		else if(num1 < num2)
		{
			if(num1 < num3)
			{
				if(num2 < num3)
				{
					largest = num3;
				}
				else
				{
					largest = num2;
				}
			}
			else
			{
				largest = num2;
			}
		}
		else
	
{
			if(num1 > num3)
			{
				largest = num1;
			}
			else
			{
				largest = num3;
			}
		}
		System.out.println("Largest number is: " + largest);
	}
}