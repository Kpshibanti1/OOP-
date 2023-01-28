package oop4;

public interface BasicCalc {
	
	//Abstraction -- idea without a real life implementation
	//abstract methods -- a method with no body -- contents
	//	1. interface -- 100% abstraction -- gives only idea
	// interface can only have abstract methods
	//	2. abstract class -- partial abstraction
	// abstract class may have abstract and non abstract methods 
			
		abstract void add(int a, int b);
		abstract void sub(int a, int b);

}
