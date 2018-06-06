
public class Condition {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a>b);
		System.out.println(a<b);
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
	
		//on or off is boolean
		boolean isInternetEnabled = false;
		boolean isGPSEnabled = true;
		
		if (isInternetEnabled) {
			if (isGPSEnabled) {
				System.out.println("you can browse google maps"); //nested is good bcoz it is more descriptive to the user 
			} else {
				System.out.println("check your GPS");
			}
		}
		else
		{
			System.out.println("check your connection");
		}
		
		if (isGPSEnabled && isInternetEnabled)//can't distinguish between two conditions which is false
			{
			System.out.println("you can browse google maps");
		} else {
			System.out.println("check your connection");
		}
		
		
		
		int ph=80;
		int mt=90;
		int ch=70;
		
		int avg=(ph+mt+ch)/3;
		
		if(avg>=90)
		{
			System.out.println("opt medical"+avg);
			
		}
		else if(avg>=80 && avg<90)
		{
			System.out.println("opt non-med" +avg);
		}
		else if(avg>=70 && avg<80)
		{
			System.out.println("opt commerce" +avg);
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("opt arts" +avg);
		}
		else
		{
			System.out.println("do business");
		}
		
		
		
		int MiniCabId=101;
		int MacroCabId= 201;
		int SedanId= 301;
		int BikeId=401;
		int AutoId= 501;
		 int UserChoice = AutoId;
		  	
		 	if(UserChoice == 501) // or if(UserChoice== SedanId)
		 	{			//confusion in making a choice n more conditions choice
		 		System.out.println("Auto is Booked");
		 	}
		 	else if(UserChoice == 401) {
		 		System.out.println("Bike is booked");
		 	}
		 	else if(UserChoice == 301) {
		 		System.out.println("Sedan is Booked");
		 	}
		 	else if(UserChoice == 201) {
		 		System.out.println("Macro Cab is booked");
		 	}
		 	else if(UserChoice == 101) {
		 		System.out.println("Mini Cab is Booked");
		 	}
		 	else{
		 		System.out.println("Please Select any of the cab");
		 	}
		 	
		 	switch (UserChoice) { //time save no condition match
				case 101: //can't write case MiniCabId bcoz it needs fixed no. otherwise this storage container can be changed if we write final MiniCabId =100; dat means it's value can't be changed
					System.out.println("Mini Cab is Booked");
					break;
				case 201:
					System.out.println("Macro Cab is booked");
					break;
				case 301:
					System.out.println("Sedan is Booked");
					break;
				case 401:
					System.out.println("Bike is Booked");
					break;
				case 501:
					System.out.println("Auto is Booked");
					break;
	
				default:
					System.out.println("enter write choice");
			}
		
		
	}

}
