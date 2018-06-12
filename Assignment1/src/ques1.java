import java.util.Arrays;

public class ques1 {

	public static void main(String[] args) {
		String[] inp= {"mile",	"xylo", "apple",	"xavier", "aar" };
		String[] arr = new String[inp.length];
		int i=0,p;
		for(String str1: inp)
		{
			if(str1.startsWith("x")) {
				arr[i]=str1;
				i++;
			}
		}	
		Arrays.sort(arr, 0, i);
		p=i;
		for(String str2: inp)
		{
			if(!str2.startsWith("x"))
			{
				arr[i]=str2;
				i++;
			}
		}
		 Arrays.sort(arr, p, i);
		for(String str2: arr)
		{
			System.out.println(str2);
			
		}
	}
}
