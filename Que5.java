import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		System.out.println("enter two numbers:");
		
		Scanner sc5=new Scanner(System.in);
		a=sc5.nextInt();
		b=sc5.nextInt();
		sc5.close();
		
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}