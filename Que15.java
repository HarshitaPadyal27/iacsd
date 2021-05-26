import java.util.Scanner;

public class Que15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		
		System.out.println("enter three numbers:");
		Scanner sc15=new Scanner(System.in);
		n1=sc15.nextInt();
		n2=sc15.nextInt();
		n3=sc15.nextInt();
		sc15.close();
		
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println(n1+" is the greatest number");
			}
			else
			{
				System.out.println(n3+" is the greatest number");
			}
		}
		else
		{
			if(n2>n3)
			{
				System.out.println(n2+" is the gratest number");
			}
			else
			{
				System.out.println(n3+" is the greatest number");
			}
		}
	}

}