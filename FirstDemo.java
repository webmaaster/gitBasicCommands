package javaFundamentals;

public class FirstDemo {
	
	public static void findSqure() {//defining method
		int myNumber = 200;
		int ans = myNumber * myNumber;
		System.out.println("The squire of "+ myNumber + " is "+ ans);
	}
	
	public static int findCube(int myNum) {
		
		int myCube = myNum * myNum * myNum;
		return myCube;
		//System.out.println("Cube of "+ myNum + " is "+ myCube);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world!");
		//System.out.println("Hello Engineers!");
		
		int num1 = 100;
		int num2 = 20;
		int num3 = num1 + num2;
		
		System.out.println(num3);
		System.out.println("Sum of "+ num1 + " and "+ num2 + " is "+ num3);
		
		findSqure();//calling method or invoking methods
		findCube();
	}

}
