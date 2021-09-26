package javaday5;

 class Account {
	long accno;
	String name;
	Account(long accno,String name)
	{
		this.accno=accno;
		this.name =name;
	}
}
	class LoanAccount extends Account
	{
		double amount;
		LoanAccount(long accno,String name,double amount)
		
		{
			super(accno,name);
			this.amount = amount;
		}
	}
	class Driver
	{
		public static void main(String[] args) 
		{
			LoanAccount la = new LoanAccount(432143,"mahes",97.765);
			System.out.println("acc no :"+la.accno);
			System.out.println("name :"+la.name);
			System.out.println(" amount :"+la.amount);
			
		}
	}


