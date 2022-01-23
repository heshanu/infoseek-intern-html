class Student{

	String name="";
	char gender;int dobYear;
	int monthNumber=0;
	static int [] marks={30,80,72};

	final int now=2022;	

	void findGender(char a){
		this.gender=a;String gen=""; 
		switch(a){
			case 'f':
				System.out.println("Female");
				break;
			case 'm':
				System.out.println("male");
				break;	
			default:
						System.out.println("invalid");														
		}
	}


	void findMonth(int m){
		this.monthNumber=m;
		String m1=" ";
		switch(m){
			case 1:
				m1="jan";break;
			case 2:
				m1="Feb";break;
			case 3:
				m1="Mar";break;
			case 4:
				m1="Apr";break;
			case 5:
				m1="May";break;
			case 6:
				m1="jubne";break;
			case 7:
				m1="july";break;
			case 8:
				m1="Aug";break;
			case 9:
				m1="Sep";break;
			case 10:
				m1="Oct";break;
			case 11:
				m1="Nov";break;
			case 12:
				m1="Dec";break;	
			default:
				m1="invalid";		
			}
		System.out.println(m1);
		}


		void finddobYear(int y){
			this.dobYear=y;
			
			
			if(y>1980 && y<2022){
					System.out.println("old now "+(now-y));
			}else{
							System.out.println("invalid year");
				}			
		}


		/*
		void findMax(String []m){
			this.marks[]=m[];
			if(m[0]>m[1]){
				if(m[0]>m[2]){
									System.out.println("max number is "+m[0]);
						}
			}
			if{m[1]>m[2]}{
							System.out.println("max number is "+m[1]);
					}
			else{	
	System.out.println("max number is "+m[2]);
				}
		}


*/

		void av(){
			double av1=(double)(marks[0]+marks[1]+marks[2])/marks.length;
			System.out.println("Average is "+av1);
			
		}
		
		
		
		void findMax(){
			if (marks[0] >=marks[1] && marks[0] >= marks[2])
				System.out.println( marks[0] + " is the maximum number.");
			else if (marks[1] >= marks[0] && marks[1] >= marks[2])
				System.out.println( marks[1] + " is the maximum number.");
			else
				System.out.println( marks[2] + " is the maximum number.");	

		}





}





