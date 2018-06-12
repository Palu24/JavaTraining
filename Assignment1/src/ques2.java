
public class ques2 {

	public static void main(String[] args) {
		int arr[] = { 3, 8, 9, 7, 6};
		int r=3,temp,n=1,i;
		while(n<r)
		{
			temp=arr[0];
			for(i=0;i< (arr.length-1); i++)
			{
				arr[i]=arr[i+1];
			}
			arr[i]=temp;
			n++;
		}
		System.out.println("The contents after rotation is as follows :");
		for(int no : arr)
		{
			System.out.println(no);
		}

	}

}
