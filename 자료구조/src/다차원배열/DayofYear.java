package 다차원배열;

/*
* 				자바 자료구조 공부
* 										윤태검
* 				
* 				그 해 경과 일 수를 구함
*/

import java.util.Scanner;

class DayofYear {

	// 각 달의 일수
	static int mdays[][] = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 윤년

	// 서기 year년은 윤년인가?
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 서기 y년 m월 d일의 크 해 결과 일 수를 구함
	static int dayOfyear(int y, int m, int d) {
		int n = 1;
		/*
		 * for (int i = 1; i < m; i++) // 1월 ~(-1)월의 일수를 더함. days += d += d +=
		 * mdays[isLeap(y)][i - 1];
		 */
		
		while (n < m) { d += mdays[isLeap(y)][n - 1]; n++; }
		 
		return d;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int retry;

		System.out.println("그 해 경과 일수를 구합니다.");

		do {
			System.out.print("년 : ");
			int year = stdin.nextInt(); // 년
			System.out.print("월 : ");
			int month = stdin.nextInt(); // 월
			System.out.print("일 : ");
			int day = stdin.nextInt(); // 일

			System.out.printf("그 해 %d 일째 입니다. \n", dayOfyear(year, month, day));

			System.out.print(" 한번 더 할까요? (1,예/0. 아니오) : ");
			retry = stdin.nextInt();
		} while (retry == 1);

	}
}
