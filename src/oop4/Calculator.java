package oop4;

public class Calculator implements BasicCalc, AdvCalc{

		@Override
		public void multiple(int a, int b) {
			int m = a*b;
			System.out.println(m);
		}

		@Override
		public void add(int a, int b) {
			int sum = a+b;
			System.out.println(sum);
		}

		@Override
		public void sub(int a, int b) {
			int sub = a-b;
			System.out.println(sub);
		}
	
		public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add(100, 100);

	}
}



