/** Trevor Fullman 
 CSC220-02
 Lab 5 */

/** This Program takes a valid value of degrees farenheit and converts it to celsius along
 * with 19 other values of degrees, adding 10 to the initial value each time.
 */


import java.text.DecimalFormat;
import java.util.Scanner;   //importing scanner and decimal format

public class FullmanTrevor_Lab05 {

	public static void main(String[]args) {

		int inidegree;
		double findegree;
		int n = 0;    // initializing variables
		final int CONVERT = 32;
		DecimalFormat form;
		int h = 0;

		Scanner in = new Scanner(System.in);   //reads keys

		while(h==0){
			System.out.print("Enter the degrees Farenheit  ");   //initial question
			inidegree = in.nextInt();      // searches for first integer typed
			if(inidegree>-459 && inidegree<212) {    // if degrees are within the domain
				h=1;    //stops asking initial question
				while(n<20) {    //runs 20 times

					findegree = ((inidegree - CONVERT)*(5.0/9.0));   //converter
					form = new DecimalFormat("##.##");     //2 decimals
					System.out.println(+inidegree+ "\t" +form.format(findegree));
					inidegree = inidegree + 10;  //adds 10
					n++;     //count increases
				}

			}

			else{    //if number is not in domain
				System.out.println("The entered degree is not within the range of -459 to 212. Enter another number.   ");

			}
		}



	}


}



