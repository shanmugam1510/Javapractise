package Practise;
import java.util.Scanner;
public class Comparison_get_user {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String num1=scan.nextLine();
		String num2=scan.nextLine();
		
		if(num1==num2)
		{
			System.out.println("Both character are equal");
		}
		else
		{
			System.out.println("Both Character are not equal");
		}

	}

}
