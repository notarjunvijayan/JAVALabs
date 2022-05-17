import java.util.*;

public class employee{
public static void main(String[] args){
	int i;
	System.out.print("Enter number of employees: ");
	Scanner num = new Scanner(System.in);
	int n = num.nextInt();
	
	details p[] = new details[n];
	for(i=0;i<n;i++)
	{
		p[i] = new details();
	}
	//DETAILS ENTRY
	System.out.println("Enter Details");
	for(i=0;i<n;i++)
	{
		p[i].create();
	}
	System.out.println("Display Details");
	for(i=0;i<n;i++)
	{
		p[i].display();
	}
}	
}

class details{

	String name;
	int uid;
	int salary;

	public void create(){

	System.out.print("Enter name: ");
	Scanner a = new Scanner(System.in);
	name = a.nextLine();

	System.out.print("Enter UID: ");
	Scanner b = new Scanner(System.in);
	uid = b.nextInt();

	System.out.print("Enter Salary");
	Scanner c = new Scanner(System.in);
	salary = c.nextInt();

}	
	public void display(){
	
	System.out.println(uid + " :	" + name + " :	" + salary);
}
}
