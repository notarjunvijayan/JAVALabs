import java.io.*;
import java.util.*;
class sinfo
{
    static int rno=89;
    private String name;
    private int total;
    sinfo(int r,String s,int t)
    {
        rno=r;
        name=s;
        total=t;
    }
    static class student
    {
        void display()
        {
            System.out.println("Roll no : "+rno);
        }
    }
}
    class Innerclass
    {
        void display1()
        {
        System.out.println("Name : "+name);
        System.out.println("Total : "+total);
        }
    
    public static void main(String args[])
    {
        Scanner io=new Scanner(System.in);
        int r,t;
        String n;
        System.out.println("Enter roll number : ");
        r=io.nextInt();
        System.out.println("Enter name : ");
        n=io.next();
        System.out.println("Enter total marks : ");
        t=io.nextInt();
        sinfo.student o1=new sinfo.student();
        o1.display();
        sinfo o2=new sinfo(r,n,t);
        sinfo.Innerclass o3=o2.new Innerclass();
        o3.display1();
       
       
    }

}
