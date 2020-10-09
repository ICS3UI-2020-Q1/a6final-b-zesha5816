import java.util.Scanner;
/**
 * A program that asks the user for 5 integer values for one array and another 5 integers for a second array. Your program will then check to see if both arrays are the same or are not and output that to the user
 * @author Ahmad Zeshan 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   //Create the Scanner
	 Scanner input = new Scanner(System.in);
	 //intialize an integer for the total numbers inputed
	 int maximumInput = 5;
	 //intialize and declare a count variable to check if both arrays are same
	 int count = 0;
	 //intialize the two arrays and declare them
	 int[] firstArray = new int[maximumInput];
	 int[] SecondArray = new int[maximumInput];
	 
	 //output message to the user to enter their array values
	 System.out.println("Please enter the values for the first array:");
	 //get inputs from users and store them in firstArray
	 for(int i = 0; i < firstArray.length; i++){
    	firstArray[i] = input.nextInt();
   }
	 //output message to the user to enter their array values
	 System.out.println("Please enter the values for the second array:");
	 //get inputs from users and store them in seccondArray
	 for(int j = 0; j < SecondArray.length; j++){
			SecondArray[j] = input.nextInt();
	 }
	 //loops the code 5 times 
	 for(int k = 0; k < maximumInput; k++){
		 /**if the first array and second array are both same add one to the count
		 */
		 if(firstArray[k] == SecondArray[k]){
			 count++;
		 /**else if the both values arent same then subtract 1 from the count
		 */
		 }else{
			 count--;
		 }
	 }
	 /**if the count was equal to the number of inputs output a message that the arrays are the same
	 */
	 if(count == maximumInput){
		 System.out.println("These arrays are the same");
	 /**else it wasnt then that means the arrays are not the same so output a message to the user that the arrays are not the same
	 */
	 }else{
		 System.out.println("These arrays are not the same");
	 }
  }
}
