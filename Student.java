package week3.day1assignments;

public class Student extends Department{
	public void Studentname()
	{
		System.out.println("priscilla");
	}
	public void Studentdept()
	{
		System.out.println("computer science");
	}
	
	public void StudentId()
	{
		System.out.println("73581");

	
}
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.Studentname();
		obj.Studentdept();
		obj.StudentId();
		
		System.out.println("multilevel inheritance");
		Department obj1=new Department();
		obj.Collegename();
		obj.Collegecode();
		obj.CollegeRank();
		
		
		
	}

}
