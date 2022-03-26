package 배열역순정렬;

/*
 * 				자바 자료구조 공부
 * 										윤태검
 * 				
 * 				배열 요소 값을 읽어 들여 역순으로 정렬합니다.
 */

import java.util.Scanner;

class ReverseArray {
	static void swap(int a[], int idx1, int idx2) {
		int t= a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
		System.out.println("a["+ idx1 +"] 와 a["+idx2+"]를 교환합니다.");
	}
	
	// 배열 a의 요소를 역순으로 정렬
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - i -1);
	}	
	
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdin.nextInt();	// 요솟수
		
		int[] x = new int[num];
				
		for (int i = 0; i < num; i++) {
			System.out.print("x["+ i +"] : ");
			x[i] = stdin.nextInt();
		}
		
		reverse(x);		// 배열 a의 요소를 역순으로 정렬

		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++)
			System.out.println("x["+ i +"] : "+x[i]);
		
		System.out.println("요소들의 합은 " + sumOf(x) +" 입니다.");
	}

}
