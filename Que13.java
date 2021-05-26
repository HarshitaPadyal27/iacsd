import java.util.Scanner;

public class Que13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j,c=0;
		
		System.out.println("enter range:");
		Scanner sc13=new Scanner(System.in);
		n=sc13.nextInt();
		sc13.close();
		System.out.println("prime numbers till "+n+" are:");
		for(i=2;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0) 
				{
					c++;
				}
			}
			if(c<=2)
			{
				System.out.print(i+" ");
			}
			c=0;
		}
	}

}