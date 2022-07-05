import java.io.*;
import java.util.*;
class Employee
{
public static void main(String args[])
{
  Scanner io=new Scanner(System.in);
  System.out.println("Enter the number of Employees :");
  int n=io.nextInt();
  info o[]=new info[n];
  int i;
  for(i=0;i<n;i++)
{
o[i]=new info();
}
for(i=0;i<n;i++)
{
  o[i].read();
}
System.out.println("Name :\t ID :\t Department :\t Salary :\t");
for(i=0;i<n;i++)
{
o[i].display();
}
}
}

class info
{
String name;
int id;
float salary;
String Dept;
public void read()
{
Scanner io=new Scanner(System.in);
System.out.println("Enter the Employee Name :");
name=io.next();
System.out.println("Enter the Employee ID : ");
id=io.nextInt();
System.out.println("Enter the Employee Department :");
Dept=io.next();
System.out.println("Enter the Employee Salary :");
salary=io.nextFloat();
}
public void display()
{
System.out.print(name +"\t");
System.out.print(id +"\t");
System.out.print(Dept +"\t");
System.out.print(salary + "\t\n");
}
}


