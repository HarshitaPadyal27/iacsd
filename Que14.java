import java.util.Scanner;

public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,sum=0,a=1,b;
		
		System.out.println("enter a number to check if it is armstrong or not:");
		Scanner sc14=new Scanner(System.in);
		num=sc14.nextInt();
		sc14.close();
		
		b=num;
		while(a!=0)
		{
			a=b/10;
			b=b%10;
			sum=sum+(b*b*b);
			b=a;
		}
		if(sum==num)
		{
			System.out.println("it is an armstrong number");
		}
		else
		{
			System.out.println("it is not an armstrong number");
		}
	}

}