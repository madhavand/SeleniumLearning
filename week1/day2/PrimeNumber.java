package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	Iterate through all numbers from 2 to n-1 (input) and for every number check if it divides n (input). 
If we find any number that divides, print prime.If nothing divides, then print non-prime
 */
		int input = 31;
		int count = 0;
		
		for(int i=2;i<input;i++) {
			if (input%i==0){
				count++;
				break;
			} 
		} 
		if(count==0)
	         System.out.println(input+" is a Prime Number.");
	      else
	         System.out.println(input+" is not a Prime Number.");
	}

}
