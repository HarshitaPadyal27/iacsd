import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=0,c=0;
		int n;
		System.out.println("enter a number to check if it is palindrome or not:");
		Scanner sc8=new Scanner(System.in);
		n=sc8.nextInt();
		sc8.close();
		
		b=n;
		while(a!=0)
		{
			a=b/10;
			b=b%10;
			c=c*10+b;
			b=a;
			
		}
		if(c==n)
		{
			System.out.println("it is a palindrome number");
		}
		else
		{
			System.out.println("it is not a palindrome number");
		}
	}

}