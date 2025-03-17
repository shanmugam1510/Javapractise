package Practise;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		int Num=scan.nextInt();
		int Div=scan1.nextInt();
		if((Num%Div)==0)
		{
			System.out.println("Yes Divisible");
		}
		else
		{
			System.out.println("No Divisible Remaining : "+Num%Div);
		}

	}

}
