import java.util.Scanner;
public class prime
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number: ");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		int i;
		int flag = 0;
		
		for(i = 2; i<num; i++)
		{
			if(num%i == 0)
			{
				flag = 0;
				break;
			}
			else
			{
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("The given number is not prime");
		}
		else
		{
			System.out.println("The given number is prime");
		}
	}
}