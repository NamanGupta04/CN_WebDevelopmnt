package objectorientedprogramming;

public class StudentUse {
	
	public static void main(String[] args) {
		Student s1 = new Student("Manisha",50);

        Student s2= new Student("Ankur",125);
		s1.name = "Naman";
//		s1.rollNumber = 001;
	
//		System.out.println(s1.name+" "+s1.rollNumber);
//		s1.setRollNumber(120);
//		s1.getRollNumber();
//		System.out.println(s1.rollNumber);
//		System.out.println(s1.name+" "+s1.rollNumber);
		
//		s2.setRollNumber(110);
//		s2.setName("Ayush");
		
		
//		Scanner s = new Scanner(System.in);
       
//		System.out.println(Student.name);

        Student s3= new Student("Ankush",145);

        System.out.println(s1.numStudents);
        System.out.println(s2.numStudents);
        
        System.out.println(Student.numStudents);
		}
		
}

