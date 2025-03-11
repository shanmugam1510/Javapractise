package Task1;
import java.util.Scanner;

public class Qustion2 {

	public static void main(String[] args) {
		
		Scanner john=new Scanner(System.in);
		int Input=john.nextInt();
		
		
		if (Input>0)
		{
			System.out.println("The given value ("+Input+ ") is Positive");
		}
		else
		{
			System.out.println("The given value ("+Input+ ") is Negative");
		}

	}

}
