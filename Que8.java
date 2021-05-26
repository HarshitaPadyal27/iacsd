import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,c=0,i;
		System.out.println("enter a number to check if it is prime or not:");
		Scanner sc8=new Scanner(System.in);
		n=sc8.nextInt();
		sc8.close();
		
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==0) 
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
	}

}