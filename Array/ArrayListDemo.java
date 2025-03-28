
//package cs.oop.arraylistdemo;
import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String  ccode;
    String cname;
    int chour;
    public Course( String  ccode, String cname,int chour)
    {
        this.ccode=ccode;
        this.cname=cname;
        this.chour=chour;
    }
    @Override
    public String toString()
    {
        return ccode+"           " +cname+"                    "+chour;      
    }
    public String getCourseName()
    {
        return cname;
    }
    public String getCourseCode()
    {
        return ccode;
    }
}
public class ArrayListDemo {

    public static void main(String[] args) {
        
      ArrayList<Course> courses =new ArrayList<>();  
       courses.add(new Course("1001","java     ",12));
       courses.add(new Course("234"," database  ",5));
       courses.add(new Course("121"," networking",3));
       courses.add(new Course("dsa1","Algorithm ",6));
       System.out.println("course code     course name        credit hours");
        for(Course cours:courses){
             System.out.println(cours);
        }
        String code;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the course code to search ");
        code=scan.nextLine();
        for(Course cours:courses){
             if(code.equals(cours.getCourseCode()));
                 {
                 System.out.println(cours.getCourseName());
                 }
             }
        
        String cccode;
        System.out.println("Enter the course code to  delete ");
        cccode=scan.nextLine();
        for(Course ccors:courses){
             if(cccode.equals(ccors.getCourseCode()));
                 {
                 courses.remove(ccors);
                 }
             }
        
        
         for(Course cour:courses){
             System.out.println(cour);
        }
        
        
        
        
        
        
        scan.close();
        }
}
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        System.out.println("Hello World!");
//        ArrayList<Integer> alist=new ArrayList<Integer>();
//        alist.add(23);
//        alist.add(34);
//        alist.add(435);
//        System.out.println("before updating");
//        for(int i=0;i<alist.size();i++){
//            System.out.println(alist.get(i));
//        }
//        alist.set(1, 20);
//        
//        System.out.println("after updating");
//         for(int i=0;i<alist.size();i++){
//            System.out.println(alist.get(i));
//        }
//         
//         alist.remove(2); 
//          System.out.println("after removing");
//         for(int i=0;i<alist.size();i++){
//            System.out.println(alist.get(i));
//        }
    

