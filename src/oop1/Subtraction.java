package oop1;

public class Subtraction extends Addition {

	
	//OOP
	//1. Inheritance
	//2. Polymorphism - 1. Overloading 2. Overriding
	//3. Encapsulation
	//4. Abstraction
	
	
	void sub(int a, int b) {
		int s = a-b;
		System.out.println(s);
	
	}//end sub
	 public int add ( int a, int b, int c) {
			int sum = a+b+5;
			return sum;
	
	}//end add
	//inheritance - establish a parent and child relationship between two class
	
	public static void main(String[] args) {
		
		Subtraction s1 = new Subtraction();
		s1.sub(100, 50);
		
		//100+100+100-75
		int sum = s1.add(100, 100, 100);
		s1.sub(sum, 75);

}//end main
}//end class