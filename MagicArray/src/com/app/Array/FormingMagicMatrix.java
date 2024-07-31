package com.app.Array;

public class FormingMagicMatrix {
	public static int FormMagicMatrix(int [][]s) {

		int magicSqures[][][]= {{{8,1,6},{3,5,7},{4,9,2}},
				{{6,1,8},{7,5,3},{2,9,4}},
				{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
	            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
	            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
	            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
	            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
	            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
		        };
		int minCost=Integer.MAX_VALUE;
		for(int [][] magicsqr:magicSqures) {
			int currval=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					currval+=Math.abs(s[i][j]-magicsqr[i][j]);
				}
			}
			minCost=Math.min(currval, minCost);
		}
		return minCost;
	}

	public static void main(String[] args) {
		int [][]s= {
				{5,3,4},
				{1,5,8},
				{6,4,2}
				};
		int res=FormMagicMatrix(s);
		System.out.println(res);

	}

}
