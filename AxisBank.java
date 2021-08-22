package week3.day1assignments;

 

public class AxisBank extends BankInfo {  
	public void deposit()
	{
		System.out.println("I have Deposit in indian bank");
	}
	public static void main(String[] args) {
		AxisBank obj= new AxisBank();
		  System.out.println("method overriding");
	    obj.deposit();
	    obj.fixed();
	    obj.Savings();
	 
	 
	}
}
