import java.io.*;
import java.util.*;

class Employee
{
protected String name;
protected float experience;
protected double salary;
}

class Department extends Employee
{
protected String dept;
public void read()
{
Scanner io=new Scanner(System.in);
System.out.println(“Enter employee name:”);
name=io.next();
System.out.println(“Enter experience:”);
experience=io.nextFloat();
System.out.println(“Enter salary:”);
salary=io.nextDouble();
System.out.println(“Enter department name:”);
dept=io.next();
}
}

class Senior extends Department
{
public void display()
{
if(this.experience>10){
System.out.print(name+”\t”+experience+”\t”+salary+”\t”+dept+”\t”);
System.out.println(” ”);
}
}
}
class multi
{
public static void main(String args[])
{
Senior o[]=new Senior[5];
for(i=0;i<5;i++){
o[i]=new Senior();
}
System.out.println(“Enter details:”);
for(i=0;i<5;i++){
o[i].read();
}
System.out.println(“Name\tExperience\tSalary\tDepartment”);
for(i=0;i<n;i++)
{
o[i].display();
}
}