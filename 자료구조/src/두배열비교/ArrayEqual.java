package 두배열비교;

/*
 * 				자바 자료구조 공부
 * 										윤태검
 * 				
 * 				두 배열이 같은지 비교한다.
 */

import java.util.Scanner;

class ArrayEqual {

	static boolean equals(int a[], int b[]) {
		if( a.length != b.length)
			return false;
		
		for(int i = 0; i < a.length; i++)
			if(a[i] != b[i])
				return false;
		
		return true;
	}
	
	static void copy(int a[], int b[]) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void recopy(int a[], int b[]) {
		int num = a.length-1;
		for(int i = 0; i < a.length; i++) {
			a[i] = b[num-i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = stdin.nextInt();				// 배열 a의 요솟수
		
		int[] a = new int[na];					// 요솟수가 na인 배열
		
		for(int i = 0; i < na; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = stdin.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdin.nextInt();	// 배열 b의 요솟수
		
		int[] b = new int[nb];		//요솟수가 nb 인 배열
		
		
		for(int i =0; i < nb; i++) {
			System.out.print("b["+i+"]");
			b[i] = stdin.nextInt();
		}
		
		System.out.println("배열 a 와 b 는 "+ (equals(a,b) ? "같습니다" : "같지 않습니다."));
		
		System.out.print("배열 b의 모든 요소를 배열 a에 복사하면 : ");
		copy(a,b);
		
		System.out.print("배열 b의 모든 요소를 배열 a에 반대로 복사하면 : ");
		recopy(a,b);
		
	}	
}
