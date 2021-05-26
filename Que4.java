import java.util.Scanner;
public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p,ans=1,i;
		
		Scanner sc4=new Scanner(System.in);
		System.out.println("enter a number: ");
		n=sc4.nextInt();
		System.out.println("enter exponent: ");
		p=sc4.nextInt();
		sc4.close();
		
		for(i=1;i<=p;i++)
		{
			ans=ans*n;
		}
		System.out.println("power of number is "+ans);
	}

}
