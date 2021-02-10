package practiceTest1;

import java.util.Scanner;

public class AgeArray {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, child=0,adult=0,senior=0;
		Scanner s1 =new Scanner(System.in);
		System.out.println("enter your age");
		a=s1.nextInt();
		int age[]= new int[a];
		
		for (int i=0;i<a;i++)
		{
		
		age[a]=s1.nextInt();

		}
		for(int j=0;j<age.length;j++)
			
		if (age[j]<18)
		{
			child++;
			
		}
		else if(age[j]>=18 && age[j]<=54)
		{
			adult++;
			
		}
		else
		{
			senior++;
		}
		System.out.println("children"+child);
		System.out.println("adult"+adult);
		System.out.println("senior"+senior);
	}

}
