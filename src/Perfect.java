import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,sum=0;
		for(int i=1;i<n;i++)
		{
			sum=sum+i;	
		}
		if(sum==n)
		System.out.println("Perfect");
		else
			System.out.println("Not Perfect");

	}

}
