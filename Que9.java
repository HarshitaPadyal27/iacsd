import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,sum=0;
		
		System.out.println("enter range:");
		Scanner sc9=new Scanner(System.in);
		n=sc9.nextInt();
		sc9.close();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of first "+n+" numbers is "+sum);
	}

}