package arraytoremember;

import java.util.Scanner;
import java.lang.String;

public class arraytoremember {
	static Scanner sc = new Scanner (System.in);
	static String [] remember = new String [5];
	static String  input;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int i = 0; i < remember.length; i++)
		{
			remember[i] = " ";
		}

		System.out.println("Enter the text :");
		input = sc.next();
		while (!(input.equalsIgnoreCase("history")))
		{
			if ((count < 99))
			{
				remember[count] = input;
				count++; 
			}
			input = sc.next();
		}


		history();

	}


	public static void history()
	{
		for (int i = remember.length-1; i>=0; i--)
		{
			if(!(remember.equals("")))
			{
				System.out.println(remember[i]);
			}

		}
	}

}
