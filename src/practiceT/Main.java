package practiceT;

import java.lang.reflect.Array;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double[] number= new double[5];
		
		double sum=0;
		
		System.out.println("Please enter 5 number :");
		for (int i=0;i<number.length;i++) {
			number [i]=input.nextInt();
		}
		
		for(int i=0;i<number.length;i++) {
			sum=sum+number[i];
		}
		System.out.println("sum of input element is :"+sum);
		System.out.println("Average of the input element is :"+sum/number.length);
		
		double max=number[0];
		double min=number[0];
		for (int i=1;i<number.length;i++) {
			if(max<number[i]) {
				max=number[i];
				
			}
		}System.out.println("The maximum element is :" +max);
		
		for (int i=1;i<number.length;i++) {
			if(min>number[i]) {
				min=number[i];
				
			}
		}System.out.println("The minimum element is :" +min);
		
		
		
		
	}
	
}
		
		
	