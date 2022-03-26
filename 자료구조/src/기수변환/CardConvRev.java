package �����ȯ;

import java.util.Scanner;

/*
 * 				�ڹ� �ڷᱸ�� ����
 * 										���°�
 * 				
 * 				�Է� ���� 10������ 2���� ~36������ �����ȯ �Ͽ� ��Ÿ��
 */

class CardConvRev {

	// ������ x�� r������ ��ȯ �Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ �մϴ�.
	static int cardConvR(int x, int r, char d[]) {
		int digits = 0; // ��ȯ���� �ڸ���
		String dchar = "0123456789ABCDEFGJIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
			x /= r;
		} while (x != 0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int no;								// ��ȯ�ϴ� ����
		int cd;								// ���
		int dno;							// ��ȯ ���� �ڸ���
		int retry;							// �ٽ� �� ��
		char[] cno = new char[32];			// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ �մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = stdin.nextInt();
			}while (no < 0);
			do {
			System.out.print("� ������ ��ȯ �ұ��? (2~36) : ");
			cd = stdin.nextInt();
		}while (cd < 2 || cd > 36);
			dno = cardConvR(no, cd, cno);		// no�� cd ������ ��ȯ
			
			System.out.print(cd+ "�����δ� ");		// ���ڸ����� ���ʷ� ��Ÿ��
			for(int i = dno - 1; i >= 0; i--)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ� �� �ұ��? (1,��/0. �ƴϿ� : ");
			retry = stdin.nextInt();
		
		}while(retry == 1);
	}

}
