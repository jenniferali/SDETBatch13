package com.syntax.reviewclass5;

import java.util.Arrays;

public class Arrays2D {

	public static void main(String[] args) {
		
		int row0 []= {1, 2, 3, 4, 5};
		int row1 []= {1, 2, 3, 4, 5};
		int row2 []= {1, 2, 3, 4, 5};
		int row3 []= {1, 2, 3, 4, 5};
		int row4 []= {1, 2, 3, 4, 5};
		
		//we can't use advance for loop to update or insert values in an array
		int [][] matrix = new int [5][5];
		matrix [0]=row0;
		matrix [1]=row0;
		matrix [2]=row0;
		matrix [3]=row0;
		matrix [4]=row0;
		
		System.out.println(Arrays.toString(matrix[0]));
		//System.out.println(matrix [0][0]);
		
		for (int [] array: matrix) {
			System.out.println(Arrays.toString(matrix[0]));
		}
	}

}
