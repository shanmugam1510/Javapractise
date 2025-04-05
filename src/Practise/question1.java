package Practise;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		Scanner shan=new Scanner(System.in);
		int score=shan.nextInt();
		if(score<=50)
		{
			System.out.println("Improve your job");
			
		}if(score>50 && score<=70)
		
		{
			System.out.println("Good Job");
			
		}if (score>=71 && score<100)
		
		{
			System.out.println("Excellent");
		}if (score>100)
		{
			System.out.println("Please give below 100");
		}

	}

}
