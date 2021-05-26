import java.util.Scanner;

public class Que12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,a=1,b,c=0;
		
		System.out.println("enter a number to be reversed:");
		Scanner sc12=new Scanner(System.in);
		n=sc12.nextInt();
		sc12.close();
		
		b=n;
		while(a!=0)
		{
			a=b/10;
			b=b%10;
			c=c*10+b;
			b=a;
		}
		System.out.println("reversed number is:");
		System.out.println(c);
	}

}