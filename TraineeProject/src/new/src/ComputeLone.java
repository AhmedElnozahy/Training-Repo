
import java.util.Scanner;
import java.math.*;
import javax.swing.*;
public class ComputeLone {

	public void bassamData()
	{
		System.out.println("Heloo Guys");
	}
	
	public static void main(String[] args){
		int lottary = (int)(Math.random()*100);
		int lottaryDigit1 = lottary/10;
		int lottaryDigit2 = lottary%10;
		while(lottary>0){
		Scanner input = new Scanner(System.in);
		System.out.println("plz enter two digit number");
		int number = input.nextInt();
		int numberDigit1 = number/10;
		int numberDigit2 = number%10;
		if(lottary == number){
			System.out.println("u win 10000$"+ "/n"+lottary+"/t"+number);
			}
		else if((lottaryDigit1==numberDigit1||lottaryDigit1==numberDigit2)
				&&(lottaryDigit2==numberDigit1||lottaryDigit2==numberDigit2)){
			System.out.println("u win 3000$"+ "/n"+lottary+"/t"+number);
					
				}
		else if(lottaryDigit1==numberDigit1||lottaryDigit1==numberDigit2
				||lottaryDigit2==numberDigit1||lottaryDigit2==numberDigit2){
			System.out.println("u win 1000$  "+ "/n"+lottary+"/t"+number);
		}
		else{
			System.out.println("u lose"+ "/n"+lottary+"/t"+number);
		}
		}
	  
	
	
		
	}
	
			
	}

	
		