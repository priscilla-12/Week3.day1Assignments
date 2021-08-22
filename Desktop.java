package week3.day1assignments;

public class Desktop extends Computer {
	public void DesktopSize()
	{
		System.out.println("1920×1080");
	}
public static void main(String[] args) {
		
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.DesktopSize();
		System.out.println("single inheritance"); 

}
 
}
