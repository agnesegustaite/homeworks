package homeWorks;

public class Wage {

	public static void name(String[] args){
		pleaseEnterYourName();
		add(A, M);
		
	
	}
	
	public static void name(String[]args){
		AM();

	
		//int salary, rate, netSalary, allowance, taxDue, taxable as double
		
		//Please enter your name : AM
		//Hi AM can you please enter your salary : 3032
		//Thank you AM can you now enter the tax rate ie .45 or .24 :.45
		//Finally AM please enter your tax free allowance : 200
		//Here's the bad news AM
		//Gross Salary = 3032.0
		//Allowance = 200.0
		//Taxable = 2832.0
		//Rate = 45.0%
		//Tax due = 1274.4
		//Net Salary = 1757.6
	
	
	public static void pleaseEnterYourName() {
		System.out.println("Please enter your name :");
	}
	
	public static void name () {
		System.out.println("AM");
		
	}
	
	//public static void pleaseEnterYourName() {
		//System.out.println("Please enter your name :" + ");
	}
	
 // declare instance variables name as a String ,salary, rate, netSalary, allowance, taxDue, taxable as double
 // declare the main method to calculate and run the app
	
 //inside the main
 // declare and create objects of type Scanner and objects of type of Wage Class to access all instance variables and methods()
 // get input from user
 // System.out.print("Please enter your name : ");
 //and store inside String name <-----
 //System.out.print("\nHi "+ myTax.name+" can you please enter your salary : ");
 //store inside salary
 //System.out.print("\nThank you " +myTax.name+ " can you now enter the tax rate ie .45 or .24 :");
 //store inside rate
 //System.out.print("\nFinally " + myTax.name + " please enter your tax free allowance : ");
 //store inside allowance
 //process
 //run calculate methods() which we created in our Wage class
 //output,
 // \t is a TAB, \n is a new line
 /*
     System.out.println("\n\tHere's the bad news " + myTax.name + "\n"+
         "\tGross Salary = \t" + myTax.salary + "\n" +
         "\tAllowance = \t" + myTax.allowance + "\n" +
         "\t\t\t________\n"+
         "\tTaxable = \t" + myTax.taxable + "\n" +
         "\tRate = \t\t" + (myTax.rate*100) + "%\n" +
         "\tTax due = \t" + myTax.taxDue + "\n" +
         "\tNet Salary = \t" + myTax.netSalary + "\n");
 */
 // method to calculate amount taxable, please watch the video first about Java keyword return
 //more info:    https://www.geeksforgeeks.org/return-keyword-java/
 public double calcTaxable(double sal, double all){
     return sal - all;
 }
 public double calcTaxDue(double txble, double rt){
     return txble * rt;
 }
 public double calcNetSal(double sal,double txDue){
     return sal - txDue;
 }
}