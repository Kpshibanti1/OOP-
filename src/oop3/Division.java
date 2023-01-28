package oop3;

import oop1.Addition;

public class Division {

		int x;
		int y;
		
		//constructor
		public Division() {
			x = 10;
			y = 10;
		}
		
		//constructor
		public Division(int x, int y) {
			this.x = x;
			this.y = y;
			
		}
		
		
		void divide() {
			double d = x/y;
			System.out.println(d);
			
		}
		
		static void divide(int a, int b, int c) {
			int d = (a+b)/c;
			System.out.println(d);
		}
		
		double divide (double a, double b) {
			double d = a/b;
			return d;
		}
	
	public static void main(String[] args) {

		Division d1 = new Division();
		System.out.println(d1.divide(100.00, 10.00));
		
		
		//10+10+10
		
		Addition a1 = new Addition();
		System.out.println(a1.add(10,10,10));
		
		d1.divide();
		
		Division d2 = new Division (200, 100);
		d2.divide();
				
		divide(100, 100, 100);
		
	}

}
