package javaday5;

 class Parent {
	 void test()
	 {
	 System.out.println("parent class");
	 
	 }

}
class Child extends Parent
{
	void test()
	{
		 System.out.println("child class");

		
	}
	
}
class Driver1
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.test();
		
	}
}