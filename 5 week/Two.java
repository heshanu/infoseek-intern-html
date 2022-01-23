class Two{

public static void main(String []ar){

int a[][]={
	{2},{-5,0,7},{1,-8,2,12}
};

for(int i=0;i<a.length;i++){
	for(int j=0;j<a[i].length;j++){
		System.out.print(a[i][j]+",");
	}
		System.out.println();	
}


int b[][][]={
	{
	{1,2},{3,4},{5,6}
	},
	{
	{7,8},{9,10},{11,12}
	}
};

	for (int[][] array2D: b) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
		System.out.print(",");
            }
		System.out.println("");
        }


	System.out.println("=================");
	int [][]arr={ {1,2},{2,4}};

	for(int[] df:arr){
		for(int fg:df){
			System.out.print(fg);
	}
	System.out.println(" ");
	}

}
}