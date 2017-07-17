package lab2csc220;

import java.lang.reflect.Array;
import java.util.Arrays;
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
		if(concat.length()>=5){
			System.out.println(concat);
			i =0;
			int ini=0;
			int end=5;
			String[] words = new String[concat.length()/5];
			System.out.println("concat length "+concat.length()/5);
			String first = concat.substring(ini,end);
			System.out.println("first: "+first+ " first length: "+first.length());
			while(first.length()==5){
				System.out.println("substring: "+first);
				words[i]=first;
				//System.out.println("in while loop i: "+i);
				i++;
				try{
					first=concat.substring(ini+5,end+5);
					ini+=5;
					end+=5;
				}
				catch(StringIndexOutOfBoundsException e){
					System.out.println("in break");
					break;
				}
			}
			System.out.println("out of while loop");
			Arrays.sort(words);
			System.out.println(words[0]);
			System.out.println(words[words.length-1]);
		}
		else{
			System.out.println("Error: Length is not greater than 5");
		}
	}
}
