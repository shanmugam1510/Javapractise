package Practise;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner c1=new Scanner(System.in);
		Scanner c2=new Scanner(System.in);
		Scanner c3=new Scanner(System.in);
		Scanner c4=new Scanner(System.in);
		Scanner c5=new Scanner(System.in);
		
		int tamil=c1.nextInt();
		int English=c2.nextInt();
		int Maths=c3.nextInt();
		int Science=c4.nextInt();
		int Social=c5.nextInt();
		
		int a=tamil+English+Maths+Science+Social;
		int b=a/5;
		if(b<35)
		{
			
			System.out.println("You are Enter the Additional Class");
			
		}else
		{
			System.out.println("Promoted You are go to next class");
		}
			
		
	}

}
