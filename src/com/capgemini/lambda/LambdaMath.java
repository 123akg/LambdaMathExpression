package com.capgemini.lambda;

@FunctionalInterface
interface MathFunction{
	int calculate(int a,int b);
}

public class LambdaMath {
	
	 public static void main(String[] args) {
		   MathFunction add=(x,y)->x+y;
		   MathFunction subtract=(x,y)->x-y;
		   MathFunction division=(x,y)->x/y;
		   int a,b;
		   a=60;
		   b=10;
		   System.out.println("Addition is : "+add.calculate(a, b));
		   System.out.println("Subtraction is : "+subtract.calculate(a, b));
		   System.out.println("Division is : "+division.calculate(a, b));
	   }

}
