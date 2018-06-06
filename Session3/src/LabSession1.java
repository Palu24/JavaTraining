import java.util.Scanner;  //read from console
//console- textual interaction with user

public interface LabSession1 {
	public static void main(String[] args) {
		//API (Application Programming Interface)
		Scanner scanner = new Scanner (System.in);       //input from user
		
		System.out.println("Enter a number");
		
		int num= scanner.nextInt(); 									//taking input
		
		System.out.println("Decimal Number System -> "+num);
		
		String  bin="", bin2="";
		int i, k=0, n=0, dis=0, occ=0, pos=0, length=0, lengthofarray=0; 
		int[] Array = new int[20]; 
		int[] Array2 = new int[20]; 
		
		while(num>0) {
			n=num%2;
			bin=bin+""+n;
			length++;
			num=num/2;
		}
				
		for(i=length-1; i>=0; i--) {
			bin2=bin2+""+bin.charAt(i);
		}
		
		System.out.println("Binary Number System -> "+bin2); 							//actual binary answer
		
		for( i=0; i<length; i++) {		
			if (bin2.charAt(i)=='1') {
				pos++;
				Array[lengthofarray]=pos;
				lengthofarray++;
			}
			else {
				pos++;
				Array2[k]=pos;
				k++;
			}
		}		
			
		for(i=0; i<lengthofarray-1; i++)
		{
		   occ=	Array[i+1]-Array[i];
		 		   if(occ>1) {
			   System.out.println("No. of zeros in between two 1's are "+(occ-1));
			   	dis++;
		 		   				}
		}	
		
		if(dis==0){
			 System.out.println("No. of zeros in between two 1's is 0 ");
		}
	}
}
