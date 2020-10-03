package cse360assignment02;
//Assignment #: 1
//Arizona State University - CSE360
//      Name: Shawn Karunanayake 
// StudentID: 1215755788
//   Lecture: 9:00 - 10:15 AM
//Description: The program is to act as a Calculator to add or substract numbers
//URL: https://github.com/skaruna2/AddingMachine


public class AddingMachine {
	private int total;
	private String OutputHistory = "0";

	/**
	   * @ description: this is the constructor for the class to intialize total to 0
	   */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	/**
	   * @ description: this method returns the total variable
	   * @return: [int] returns the total sum 
	   */
	public int getTotal() {
		return total;
	}

	/**
	   * @ description: this method add the parameter to the total and also add the history of calculations to the output
	   * @param: int value  
	   */
	public void add(int value) {
		total = total + value;
		OutputHistory = OutputHistory + " + " + value;
	}

	/**
	   * @ description: this method subtracts the parameter from the total then adds the calculation to the history string
	   * @param: int value
	   */
	public void subtract(int value) {
		total = total - value;
		OutputHistory = OutputHistory + " - " + value;
	}

	/**
	   * @ description: this method returns the variable OutputHistory with holds all the calculations
	   * @return: [String] return the outputHistory
	   */
	public String toString() {
		return OutputHistory;
	}

	/**
	   * @ description: this method resets the values of the total and calculation history
	   */
	public void clear() {
		total = 0;
		OutputHistory = "0";
	}
}