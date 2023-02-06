package week1.day2;
public class Car {
public long getRegistrationNumber()
{
	long regNumber = 6867;
	return regNumber;
}
private String getOwnerName(){
	String ownerName = "Madhavan";
	return ownerName;
}
	void printCarModel(){
	System.out.println("Duster");
}
public boolean isPunctured(){
	boolean punctured = false;
		return punctured;
}
public int substraction(int numberOne, int numberTwo){
	int subOutput = numberOne-numberTwo;
	return(subOutput);
}
public int multiplication(int numberOne, int numberTwo,int numberThree){
	int multiOutput = numberOne*numberTwo*numberThree;
	return(multiOutput);
}
public int division(int numberOne, int numberTwo){
	int divOutput = numberOne/numberTwo;
	return(divOutput);
}
	public static void main(String[] args) {
	Car c = new Car();
	long regNumber = c.getRegistrationNumber();
	System.out.println("Car Number - "+regNumber);
	String ownerName = c.getOwnerName();
	System.out.println("Car Owner Namer - "+ownerName);
		c.printCarModel();
	boolean punctured = c.isPunctured();
	System.out.println(punctured);
	int subOutput =	c.substraction(22,3);
	System.out.println(subOutput);
	int multiOutput = c.multiplication(1, 2, 3);
	System.out.println(multiOutput);
	int divOutput = c.division(100,10);
	System.out.println(divOutput);
	}
}