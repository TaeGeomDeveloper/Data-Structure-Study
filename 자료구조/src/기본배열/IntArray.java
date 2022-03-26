package 기본배열;

/*
 * 				자바 자료구조 공부
 * 										윤태검
 * 				
 * 				기본 배열
 */

class IntArray {

	public static void main(String[] args) {
		int a[] = new int[5];		// 배열의 선언
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1]*2;
		
		for(int i = 0; i < a.length; i++)	// 각요소 의 값
			System.out.println("a["+i+"] = "+a[i]);
	
		System.out.println();
		
		int b[] = {1,2,3,4,5};	// 배열 초기화
	
		for(int i = 0; i < b.length; i++)	// 각요소 의 값
			System.out.println("b["+i+"] = "+b[i]);
		
		System.out.println();
		
		int c[] = b.clone();
		
		c[3] = 0;
		for(int i = 0; i < c.length; i++)	// 각요소 의 값
			System.out.println("c["+i+"] = "+c[i]);
		
	}

}
