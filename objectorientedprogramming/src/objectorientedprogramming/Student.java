package objectorientedprogramming;

public class Student {
	
	public String name;
    final private int rollNumber;
    double cgpa;
    final double converisonFactor= 0.95;
    static int numStudents;

    public Student(String name, int rollNumber){
      this.name=name;
      this.rollNumber= rollNumber;
      numStudents++;
    }

	public int getRollNumber() {
		return this.rollNumber;
	}
	
//	public void setRollNumber(int rollNumber) {
//		if (rollNumber<=0){
//			return;
//		}
//		this.rollNumber = rollNumber;
//	}
}


