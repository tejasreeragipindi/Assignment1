import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,r,num;
		num=n;
		while(n!=0)

		{  
			r=n%10;  
			sum = sum + r*r*r;
			n=n/10;
		}  
		if(num == sum)
			System.out.println("Armstrong");   
		else  
			System.out.println("Not Armstrong ");

	}

}
