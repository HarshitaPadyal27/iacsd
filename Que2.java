import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,add;
		char ch1,ch2;
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter two numbers:");
		a=sc2.nextInt();
		b=sc2.nextInt();
		System.out.println("enter two characters: ");
		ch1=sc2.next().charAt(0);
		ch2=sc2.next().charAt(0);
		sc2.close();
		add=a+b;
		System.out.println("addition of numbers is "+add);
		
		System.out.println("addition of characters is "+ch1+"+"+ch2);
		
	}

}