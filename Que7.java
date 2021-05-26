import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double n,m;
		
		System.out.println("enter a number:");
		
		Scanner sc7=new Scanner(System.in);
		n=sc7.nextDouble();
		System.out.println("enter power:");
		m=sc7.nextDouble();
		sc7.close();
		
		System.out.println(+n+" to power "+m+" is "+Math.pow(n, m));
		
	}

}