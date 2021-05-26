import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,fact=1;
		
		System.out.println("enter a number:");
		Scanner sc6=new Scanner(System.in);
		
		n=sc6.nextInt();
		sc6.close();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of given no is:"+fact);
		
	}

}