package 배열최대값;

/*
 * 				자바 자료구조 공부
 * 										윤태검
 * 				
 * 				기본 배열
 */

import java.util.Scanner;
import java.util.Random;


class MaxOfArray {
	
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i = 1; i < a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다. ");
		System.out.print("사람의 수 : ");
		int num = stdin.nextInt();			//	배열의 요솟수를 입력 받음.
		
		int height[] = new int[num];		// 요솟수가 num 인 배열을 생성
		
		for(int i= 0; i< num; i++) {
			System.out.print("height["+i+"]: ");
			height[i] = stdin.nextInt();
		}
		
		System.out.println("최대값은 "+maxOf(height)+"입니다.");
		
		
		System.out.println("랜덤 키의 최댓값을 구합니다. ");
		System.out.print("사람의 수 : ");
		int num2 = stdin.nextInt();			//	배열의 요솟수를 입력 받음.
		
		int height2[] = new int[num2];		// 요솟수가 num 인 배열을 생성
		
		for(int i= 0; i< num; i++) {
			System.out.print("height2["+i+"]: ");
			height2[i] = 100 + rand.nextInt(90);
			System.out.println(height2[i]);
		}
		System.out.println("최대값은 "+maxOf(height2)+"입니다.");
	}

}
