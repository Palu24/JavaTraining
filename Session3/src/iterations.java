
public class iterations {

	public static void main(String[] args) {
		//for repeating things again and again use loops
		//Task1
		int num = 5;
		int i=1;
		while(i<=10){    //it expects either true or false
			System.out.println(num+ " " +i+ "'s are " +(num*i));
			i++;
		}
		//Task2 
		num=7;
		i=1;
		do {	
			//eg used in banks 
		System.out.println(num+ " " +i+ "'s are " +(num*i));
		i++;
		}while(i<=10);
		
		
		//Task3
		System.out.println("**************************");
		i=1;
		do {	
			 
			System.out.print("* ");
	
			i++;
		}while(i<=10);

		//Task4
		System.out.println(" ");
		for(i=0,num=11;i<10;i++,num++) //multiple initialization
		{
			System.out.println(num+ " " +i+ "'s are " +(num*i));
		}
		
		
		 
		

	}

}
