import java.io.*;
import java.util.*;
class fact
{  
 public static void main(String args[])
 {  
  int i,fact=1;
  System.out.print("Enter number: ");
  Scanner C =new Scanner(System.in);  
  int num=C.nextInt();    
  for(i=1;i<=num;i++)
  {    
      fact=fact*i;    
  }    
  System.out.println("Factorial of " +num+ " is: "+fact);    
 }  
}  