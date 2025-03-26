package oop.cs.lab;
import java.util.Scanner;
 class Student {
     int id ;
     String name;
     String department;
     public Student(int id ,String name,String department)
     {
         this.id=id;
         this.name=name;
         this.department=department;
     }
     public void displyInfo()
     {
         System.out.println(" id "+id + "  name  "+name +"   department  "+department);
     }
 }
class StudentRegistr{
    private Student []students;
    private int counter;
    public StudentRegistr(int max)
    {
        students =new Student[max];
        counter=0;
    }
    public void register(int id ,String depart,String name)
    {
        if(counter<students.length)
        { 
            students[counter]=new Student(id,name,depart);
            counter++;
        }
    }
    public void viewAllStudnet()
    {
        if(counter==0)
        {
            System.out.println("there is no student ");
        }
        else
        {
                   for(int i=0 ;i<counter;i++)
                   {
                     students[i].displyInfo();
                   }
        }
    }
            
}
public class Lab {

    public static void main(String[] args) {
        
        int choice;
        int maxStud;
        Scanner scanner=new Scanner(System.in); 
        System.out.println("Well come to this is student registerition system ");
        System.out.print("enter the maximum number of student to register this system ");
        maxStud=scanner.nextInt();
        StudentRegistr registral=new StudentRegistr(maxStud);
   
        int id;
        String department;
        String name;
        
        do{
        
        System.out.println("1.register student ");
        System.out.println("2.display all  student info  ");
        System.out.println("0.exit  ");
        System.out.println("enter your choice ");
        choice=scanner.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("enter your id ");
                id=scanner.nextInt();
                System.out.println("enter your name :");
                name=scanner.nextLine();
                scanner.nextLine();
                System.out.println("enter your department");
                department=scanner.nextLine();
                registral.register(id, department, name);
                break;
            case 2:
                registral.viewAllStudnet();
                break;
            case 0: 
                break;
                
            default:
                System.out.println("enter the correct option ");
                break;
                
                        
        }

            
         
        }while(choice!=0);
         scanner.close();
    }
    
}
