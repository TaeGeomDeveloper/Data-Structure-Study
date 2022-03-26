package �������迭;

/*
* 				�ڹ� �ڷᱸ�� ����
* 										���°�
* 				
* 				�� �� ��� �� ���� ����
*/

import java.util.Scanner;

class DayofYear {

	// �� ���� �ϼ�
	static int mdays[][] = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // ����

	// ���� year���� �����ΰ�?
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// ���� y�� m�� d���� ũ �� ��� �� ���� ����
	static int dayOfyear(int y, int m, int d) {
		int n = 1;
		/*
		 * for (int i = 1; i < m; i++) // 1�� ~(-1)���� �ϼ��� ����. days += d += d +=
		 * mdays[isLeap(y)][i - 1];
		 */
		
		while (n < m) { d += mdays[isLeap(y)][n - 1]; n++; }
		 
		return d;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int retry;

		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");

		do {
			System.out.print("�� : ");
			int year = stdin.nextInt(); // ��
			System.out.print("�� : ");
			int month = stdin.nextInt(); // ��
			System.out.print("�� : ");
			int day = stdin.nextInt(); // ��

			System.out.printf("�� �� %d ��° �Դϴ�. \n", dayOfyear(year, month, day));

			System.out.print(" �ѹ� �� �ұ��? (1,��/0. �ƴϿ�) : ");
			retry = stdin.nextInt();
		} while (retry == 1);

	}
}
