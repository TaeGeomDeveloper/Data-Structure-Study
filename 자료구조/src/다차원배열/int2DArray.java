package 다차원배열;
 
/*
 * 				자바 자료구조 공부
 * 										윤태검
 * 				
 * 				2행 4열의 2차원 배열
 */

public class int2DArray {

	public static void main(String[] args) {
		int x[][] = new int [2][4];
		
		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;
		
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 4; j++)
				System.out.println("x["+i+"]["+j+"] = "+ x[i][j]);
	}

}
