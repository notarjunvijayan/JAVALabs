import java.io.*;
import java.util.*;
class UseStatic {
   static int a = 6;
   static int b;
   
  static void change(int x){
  System.out.println("x = " + x);
  System.out.println("\n\n a = " + a);
  System.out.println("\n\n b = " + b);
}

static {
  b= a * 4;
}

public static void main(String args[]){
Scanner io=new Scanner(System.in);
System.out.print("\nEnter a Number : ");
int num=io.nextInt();
change(num);
}
}