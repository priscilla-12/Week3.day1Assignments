package week3.day1assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id" + id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id" + id);
		System.out.println("Student name" + name);
	}
	public void getStudentInfo(String emailid, long phonenumber) {
		System.out.println("Student emailid" + emailid);
		System.out.println("Student phonenumber" + phonenumber);
}
	public static void main(String[] args) {
		 
		
		Students obj = new Students();
		System.out.println("Method Overloading");
		obj.getStudentInfo(255);
		obj.getStudentInfo(256, "priscilla");
		obj.getStudentInfo("priscilla7845@gmail.com",735830796);

}
}