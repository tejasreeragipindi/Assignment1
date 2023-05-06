import java.util.Scanner;
public class Strong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num,r,sum=0,fact,i;
		num=n;
		while(n!=0)
		{

		      r=n%10;
                fact =1;
			for(i=1;i<=r;i++)
		       {
                   fact=fact*i;
                 }
                 sum=sum+fact;
			 n=n/10;	
		}
		if(sum==num)
			System.out.println("Strong");
		else
			System.out.println("Not Strong");
		

	}

}
