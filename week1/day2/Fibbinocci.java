package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		Print first number
		Iterate from 1 to the 11
		Add first and second number assign to sum
		Assign second number to the first number
		Assign sum to the second number
		Print sum */
		
		double firstNum = 0;
		double secondNum = 1;
		double sum = 0;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i=1;i<=56;i++) {
			sum = firstNum + secondNum;
			System.out.println(sum);
			firstNum = secondNum;
			secondNum = sum;		
		} 
		
	}

}
