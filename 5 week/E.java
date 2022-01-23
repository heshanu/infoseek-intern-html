class E{

	public static void main(String []ae){

			int [][] c = {
					{2},
					{-5,0,7},
					{1,-8,2,12}
				};

			for (int i=0;i<c.length;i++){
				
				for(int j=0;j<c[i].length;j++){
					System.out.print(c[i][j]+"");
				}
				System.out.println();
				}
				System.out.println(c[0].length);
				System.out.println(c[1].length);
				System.out.println(c[2].length);
				
				System.out.println("##############");
				
				 
				/*int [][][] d = new int [2][3][2];
				d[0][0][0] = 1;
				d[0][0][0] = 1;
				*/
				int [][][] d = {
					{
						{1,2},
						{3,4},
						{5,6}
					},
					{
						{7,8},
						{9,10},
						{11,12}
					},
				};


				//int [][][] d = {{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}};
				for(int i=0;i<2;i++){
					for(int j=0;j<3;j++){
						for(int k=0;k<2;k++){
							System.out.print(d[i][j][k]+" ");
						};
					}
					System.out.println();
				}
				System.out.println();
			}




}