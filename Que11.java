import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,odd=0,even=0;
		
		System.out.println("enter range:");
		Scanner sc11=new Scanner(System.in);
		n=sc11.nextInt();
		sc11.close();
		
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else 
			{
				odd=odd+i;
			}
		}
		System.out.println("sum of odd numbers is: "+odd);
		System.out.println("sum of even numbers is: "+even);
	}

}