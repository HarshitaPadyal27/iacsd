import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p,n,r,ci,a;
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("enter principle amount:");
		p=sc3.nextDouble();
		System.out.println("enter rate of interest:");
		r=sc3.nextDouble();
		System.out.println("enter no of years:");
		n=sc3.nextDouble();
		sc3.close();
		
		a=p*Math.pow(1+(r/100), n);
		System.out.println("compound amount is "+a);
		
		ci=a-p;
		System.out.println("compound interest is "+ci);
	}

}