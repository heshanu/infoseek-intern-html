class Ar1{
	public static void main(String []ar){
	int [][]x={
		{1,2,3},
		{4,5,6},
		{7,8,9}
	};

	//System.out.println(x[0][0]);
	for(int i=0;i<x.length;i++){
		for(int j=0;j<3;j++){
		System.out.print("["+x[i][j]+"]");
		}
	System.out.println("");
		}
		//System.out.println(x.length);
	System.out.println();
	String details[][]=new String[2][2];

	details[0][0]="Hesha";
	details[0][1]="12";
	details[1][0]="Hesha1";
	details[1][1]="122";

	for(int i=0;i<details.length;i++){
	  for(int j=0;j<details.length;j++){
		System.out.print("["+details[i][j]+"]");
	  }
	System.out.println("");
	}



    }

}