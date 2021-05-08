package javatask;

public class Student
{
	private int studentId;
	 
	 private String studentName;
	 
	 private int marks;
	 
	 private char grade;
	
	 Student()
	 {
		 System.out.println("Construcor is created");
		 
	 } 
	 
	 Student(int id, String name, int score,char grades)
	 {  
		 studentId =id; 
		 
		 studentName =name;  
		 
		    marks=score;
		    
		    grade=grades;
		    
		    
	 }  
	 void displayDetails()
	 {
		 System.out.println(studentName+" "+studentId+" "+marks+" "+grade);
		 
	 }
	 public void caluculateGrade()
	 {
		 if(marks>90)
		 {
		 System.out.println(grade);
		 }
		 else if(marks>81&&marks<90)
		 {
		 System.out.println(grade);
		 }
		 else if(marks>71&&marks<80)
		 {
		 System.out.println(grade);
		 }
		 else if(marks>61&&marks<70)
		 {
		 System.out.println(grade);
		 }
		 else if(marks<61)
		 {
		 System.out.println(grade);
		 }
	 }
	 
	public static void main(String[] args)
	{
		 
		Student s1 = new Student(101,"pawan",95,'A');  
	     
		Student s2 = new Student(102,"kiran",84,'B');  
		
		Student s3 = new Student(103,"naveen",76,'C');  
		
		Student s4 = new Student(104,"madhav",63,'D');  
		
		Student s5 = new Student(105,"kesav",59,'E');  
		
	    s1.displayDetails();
	    
	    s2.displayDetails();
	    
	    s3.displayDetails();
	    
	    s4.displayDetails();
	    
	    s5.displayDetails();

	}

}
