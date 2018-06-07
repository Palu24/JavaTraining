

public class PopulationArrays {

	public static void main(String[] args) {
		
	int i, j, f, m, TotalPopL=0,TotalPopC=0,TotalPopS=0;
	int pop [][][] = 			{																									//1 State
												{													//1 City
													{9,11,0},      //1 locality 
			 										{11,12,3},    //2 locality 
			 										{21,11,0},    //3 locality 
			 										{12,9,0},      //4 locality 
													{13,13,1}     //5 locality
												},
												
												{													//2 City
													{9,11,0},      //1 locality 
			 										{11,12,3},    //2 locality 
			 										{11,10,1},    //3 locality 
			 										{12,9,0},      //4 locality 
													{13,13,1}     //5 locality
													
												},
												
												{													//3 City
													{9,11,0},      //1 locality 
			 										{11,12,3},    //2 locality 
			 										{13,12,6},    //3 locality 
			 										{12,9,0},      //4 locality 
													{13,13,1}     //5 locality
												},
												
												{													//4 City
													{9,11,0},      //1 locality 
			 										{11,12,3},    //2 locality 
			 										{19,9,9},    //3 locality 
			 										{12,9,0},      //4 locality 
													{13,13,1}     //5 locality
												},
												
												{													//5 City
													{9,11,0},      //1 locality 
			 										{11,12,3},    //2 locality 
			 										{7,19,2},    //3 locality 
			 										{12,9,0},      //4 locality 
													{13,13,1}     //5 locality
												}
												
											};										
	/*	
		//Ask From Sir
		int arr[]= {1,2};
		int p;
		for (p : arr)
		{
			System.out.println(p);
		}
		
		*/
	
		for(j=0; j<pop.length; j++) {
			TotalPopC=0;
			for(i=0; i<pop[j].length; i++ ) {
				TotalPopL=0;
				for(int n : pop[j][i]){
					TotalPopL = TotalPopL+n;
				} 
				System.out.println("Total Population in Locality "+(i+1)+" is "+TotalPopL);
				TotalPopC=TotalPopC+TotalPopL;
			}
		    System.out.println("Total Population in City "+(j+1)+" is "+TotalPopC);	
		    System.out.println();
			TotalPopS=TotalPopS+TotalPopC;
		}
		System.out.println("Total Population in State 1 is "+TotalPopS);	
		System.out.println();
		
	//Count of Female in State
		System.out.println("Count No. of Female in Cities");
		System.out.println();
		TotalPopS=0;
		int female[]=new int[5];
		
		for(j=0; j<pop.length; j++) {
			TotalPopC=0;
			for(i=0; i<pop[j].length; i++ ) {
				TotalPopL=pop[j][i][1];
				System.out.println("Total Population of female in Locality "+(i+1)+" is "+TotalPopL);
				TotalPopC=TotalPopC+TotalPopL;
			}
		    System.out.println("Total Population of female in City "+(j+1)+" is "+TotalPopC);	
		    female[j]=TotalPopC;
		    System.out.println();
			TotalPopS=TotalPopS+TotalPopC;
		}
		System.out.println("Total Population of female in State 1 is "+TotalPopS);
		System.out.println();
		int TotalFemale=TotalPopS;
		
		//Count of Male in State
				System.out.println("Count No. of Male in Cities");
				System.out.println();
				TotalPopS=0;
				int male[]=new int[5];
				
				for(j=0; j<pop.length; j++) {
					TotalPopC=0;
					for(i=0; i<pop[j].length; i++ ) {
						TotalPopL=pop[j][i][0];
						System.out.println("Total Population of male in Locality "+(i+1)+" is "+TotalPopL);
						TotalPopC=TotalPopC+TotalPopL;
					}
				    System.out.println("Total Population of male in City "+(j+1)+" is "+TotalPopC);	
				    male[j]=TotalPopC;
				    System.out.println();
					TotalPopS=TotalPopS+TotalPopC;
				}
				int TotalMale=TotalPopS;
				System.out.println("Total Population of male in State 1 is "+TotalPopS);	
				System.out.println();
				
			//Count of Others in State
				System.out.println("Count No. of Others in Cities");
				System.out.println();
				TotalPopS=0;
				int others[]= new int [5];
				
				for(j=0; j<pop.length; j++) {
					TotalPopC=0;
					for(i=0; i<pop[j].length; i++ ) {
						TotalPopL=pop[j][i][2];
						System.out.println("Total Population of others in Locality "+(i+1)+" is "+TotalPopL);
						TotalPopC=TotalPopC+TotalPopL;
						}
				    System.out.println("Total Population of others in City "+(j+1)+" is "+TotalPopC);	
				    others[j]=TotalPopC;
				    System.out.println();
					TotalPopS=TotalPopS+TotalPopC;
				}
				System.out.println("Total Population of others in State 1 is "+TotalPopS);	
				System.out.println();
				int TotalOthers=TotalPopS;
				
		//Females or males who are present in large amount
				
				if(TotalFemale>TotalMale)
				{
					System.out.println("Females are More in the State");
				}
				else
				{
					System.out.println("Males are More in the State");
				}
				System.out.println();
				
			//count highest no. of males,females and others among cities
					int temp = female[0];
					 i=1;
					for(int n=0; n< (female.length-1); n++)
					{
						if(temp<female[n+1]) {
							temp=female[n+1];
							i=n+1;
						}								
					}
					System.out.println("The city "+i+" is having highest no. of females i.e. "+ temp);
					System.out.println();
					temp = male[0];
					 i=1;
					for(int n=0; n< (male.length-1); n++)
					{
						if(temp<male[n+1]) {
							temp=male[n+1];
							i=n+1;
						}								
					}
					System.out.println("The city "+i+" is having highest no. of males i.e. "+ temp);
					System.out.println();
					temp = others[0];
					 i=1;
					for(int n=0; n< (others.length-1); n++)
					{
						if(temp<others[n+1]) {
							temp=others[n+1];
							i=n+1;
						}								
					}
					System.out.println("The city "+i+" is having highest no. of others i.e. "+ temp);
			
		
	}

}
