package lab2csc220;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		String concat = "";
		int i=1;
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
	//	System.out.println("next line: " + temp);
	//	System.out.println("hereeee");
	//	System.out.println("has next line " + scan.nextLine());
		while(!temp.isEmpty()){
			//System.out.println("lawl "+temp);
			if(i==1){
			//	System.out.println("in i=1");
				concat=concat.concat(temp);
				i=2;
			}
			else{
			//	System.out.println("in i=2");
				concat=concat.concat(" " + temp);
			}	
			temp = scan.nextLine();
		}
		System.out.println(concat);
	}
}
