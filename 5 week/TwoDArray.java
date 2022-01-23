class TwoDArray{

	public static void main(String []ar){


		String aq[][]={
			{"A","B","C"},
			{"G","H","I"},
			{"D","E","F"}		
		};

		for(int i=0;i<aq.length;i++){
			for(int j=0;j<aq[i].length;j++){
				System.out.print(aq[i][j]+",");
				}
		System.out.println();
				
	}
		System.out.println("===============");
		

		String a[][]={
			{"D","E","F"},		
			{"G","H","I"},
			{"A","B","C"}
	};
	for(int q=2;q>=0;q--){
		for(int w=0;w<=2;w++){
			System.out.print(a[q][w]);
		}
		System.out.println();
	}

}
}


	


