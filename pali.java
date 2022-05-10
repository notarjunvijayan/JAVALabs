import java.util.Scanner;

public class pali
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number: ");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		int i=num,j,rev = 0,temp;
		while(i>10)
		{
			temp = i%10;
			rev = (rev*10) + temp;
			i = i/10;
		}
		rev = (rev*10) + i;
		
		if(num == rev)
		{
			System.out.println("The given number is a palindrome");
		}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}
}