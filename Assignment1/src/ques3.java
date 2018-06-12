import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of candies");
		int n= scanner.nextInt();
		System.out.println("Enter the value of m");
		int m= scanner.nextInt();
		
		int no=0,arr[]=new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=i;
		}
		int count=0;
		do
		{
			arr[no]=0;
			System.out.println(no);	
			no=no+m;
			count++;
			if(no>n-1) 
				no=no-n;
		}while(arr[no]!=0);
		System.out.println("The person has eaten "+count+" candies");
		
	}

}
