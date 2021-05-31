package com.realemployee;

import java.util.Scanner;
abstract class Employee
{   
	String name;
	int age;
	int salary;
	String job;
	Scanner sc =  new Scanner(System.in);
	public Employee( )
       	{
                	      System.out.println("\nenter name:");
                        name=sc.next();  
                        System.out.println("enter  your age:");
                        age=sc.nextInt();
                        
	}
	public void disp( )
	{
                        System.out.println("name:"+name+" \n age:"+age+ "\n salary:"+salary+"\n job:"+job);
	}
	public abstract void raise();
              
}
final class Clerk extends Employee
{
       public Clerk( )
                {
	salary=8000;
	job="Clerk";
                }

      public void raise( )
                {
	salary = salary+1000;
	System.out.println("\nsalary raised........");
                }
}
final class Programmer extends Employee
{
       public Programmer( )
                {
	salary=20000;
	job="Programmer";
                }

      public void raise( )
                {
	 salary = salary+5000;
	 System.out.println("\nsalary raised........");
                }
}
final class Manager extends Employee
{
       public Manager()
                {
	salary=25000;
	job="Manager";
                }

      public void raise( )
                {
	salary = salary+7000;
	System.out.println("\nsalary raised........");
                }
}
public class FinalEmployee
{
public static void main(String[] args)
{ 	
	Scanner sc =  new Scanner(System.in);
                  Employee[] e = new Employee[10];
	int c, c1=0, i=0;
	do
	{
	     System.out.println("\n1.Create");
                       System.out.println("2.Display");
                       System.out.println("3.Raise salary");
	     System.out.println("4.Exit");
                	     System.out.println("Enter your choice");
                       c=sc.nextInt();
                       switch(c)
	    {
		case 1:     do
		               {
			System.out.println("\n1.Clerk");
			System.out.println("2.Programmer");
			System.out.println("3.Manager");
			System.out.println("4.Exit");
			System.out.println("Enter your Choice");
			c1=sc.nextInt( );
			switch(c1)
			{
			     case 1: e[i]= new Clerk( );
				i++;
				break;
			     case 2: e[i]= new Programmer( );
				i++;
				break;
			     case 3: e[i]= new Manager( );
				i++;
				break;
			}
			}while(c1!=4);
		          break;
				
  		case 2: try
		           {
			for(Employee x: e)
			{
			      if(x!=null)
			      x.disp();
			}
		            }catch (Exception ex) {
			 System.out.println("No records...");
			}
		case 3: try
		           {
			for(Employee x: e)
			{
			      if(x!=null)
			      x.raise();
			}
		            }catch (Exception ex) {
			 System.out.println("No records...");
			}
		case 4: System.out.println("\nExisting..........!!");
			break;
		default: System.out.println("\nInvalid Choice..........!!"); 
			
	        }
	}while(c!=4);
}
}
