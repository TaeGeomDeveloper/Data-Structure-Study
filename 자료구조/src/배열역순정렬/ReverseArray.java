package �迭��������;

/*
 * 				�ڹ� �ڷᱸ�� ����
 * 										���°�
 * 				
 * 				�迭 ��� ���� �о� �鿩 �������� �����մϴ�.
 */

import java.util.Scanner;

class ReverseArray {
	static void swap(int a[], int idx1, int idx2) {
		int t= a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
		System.out.println("a["+ idx1 +"] �� a["+idx2+"]�� ��ȯ�մϴ�.");
	}
	
	// �迭 a�� ��Ҹ� �������� ����
	
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
		
		System.out.print("��ڼ� : ");
		int num = stdin.nextInt();	// ��ڼ�
		
		int[] x = new int[num];
				
		for (int i = 0; i < num; i++) {
			System.out.print("x["+ i +"] : ");
			x[i] = stdin.nextInt();
		}
		
		reverse(x);		// �迭 a�� ��Ҹ� �������� ����

		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i = 0; i < num; i++)
			System.out.println("x["+ i +"] : "+x[i]);
		
		System.out.println("��ҵ��� ���� " + sumOf(x) +" �Դϴ�.");
	}

}
