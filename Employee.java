import java.util.Scanner;
class Emp
{
     String name;
     int age;
     double salary;
     String designation;
         Scanner s = new Scanner(System.in);
        public void create()
         { 
                                   System.out.println("Enter name");
                                   name = s.next();
                                   System.out.println("Enter age");
                                   age= s.nextInt();
                                   System.out.println("Enter salary");
                                   salary = s.nextDouble();
                                   System.out.println("Enter designation");
                                   designation = s.next();
        }
        public void display()
        {
               System.out.println("name:"+name);
               System.out.println("age:"+age);
               System.out.println("salary:"+salary);
               System.out.println("designation:"+designation);
        }
       public void raisesalary()
      {
             salary=salary+5000;
            System.out.println("salary is raised");
     }
}
class Employee
{
             public static void main(String []args)
{
               Emp e = new Emp();
               int c;
               do
              {
                   Scanner s = new Scanner(System.in);
               System.out.println("Choices are 1.Create,2.Display,3.RaiseSalary,4.Designation");
               System.out.println("Enter your choice");
               c = s.nextInt();
               switch(c)
               {
                     case 1: e.create();
                                    break;
                     case 2:e.display();
                                  break;
                      case 3:e.raisesalary();
                                     break;
               }
               }while(c>0 && c<4);
}
}

         