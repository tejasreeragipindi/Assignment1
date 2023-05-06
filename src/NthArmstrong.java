import java.util.Scanner;
public class NthArmstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,sum=0,I=0,num;
		num=n;
		while(n!=0)
		{
			r=n%10;
			I++;
			n=n/10;		
		}
		n=num;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;		
		}
		if(sum==num)
			System.out.println("Amstrong");
		else
			System.out.println("Not Amstrong");

	}

}
