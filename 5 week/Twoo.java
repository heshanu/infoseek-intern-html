class Twoo{

public static void main(String []ar){
/*

	int threeDArray[][][]={
		{
			{1,2},{3,4},{5,6}
		},
		{
			{7,8},{9,10},{11,12}
		}
	};
	
	for(int [][]twoArray:threeDArray){
		for(int []oneArray:twoArray){
			for(int arq:oneArray){
				System.out.print(arq+",");
			}
				System.out.println(" ");
		}
		System.out.println();
	}

	int [][]g={
			{1,2,3},{3,4,5},{5,6,7},{7,8,9}
		};
	for(int []w:g){
		for(int a:w){	
			System.out.print(a);
		}
		System.out.println();
	}	
	*/
	 try {
        String hibernateVersion = org.hibernate.annotations.common.Version.VERSION;
        System.out.println("Hibernate Version: "+ hibernateVersion);
    } catch (Exception e) {
        e.printStackTrace();
    }
	}
}