package �ι迭��;

/*
 * 				�ڹ� �ڷᱸ�� ����
 * 										���°�
 * 				
 * 				�� �迭�� ������ ���Ѵ�.
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
		
		System.out.print("�迭 a�� ��ڼ� : ");
		int na = stdin.nextInt();				// �迭 a�� ��ڼ�
		
		int[] a = new int[na];					// ��ڼ��� na�� �迭
		
		for(int i = 0; i < na; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = stdin.nextInt();
		}
		
		System.out.print("�迭 b�� ��ڼ� : ");
		int nb = stdin.nextInt();	// �迭 b�� ��ڼ�
		
		int[] b = new int[nb];		//��ڼ��� nb �� �迭
		
		
		for(int i =0; i < nb; i++) {
			System.out.print("b["+i+"]");
			b[i] = stdin.nextInt();
		}
		
		System.out.println("�迭 a �� b �� "+ (equals(a,b) ? "�����ϴ�" : "���� �ʽ��ϴ�."));
		
		System.out.print("�迭 b�� ��� ��Ҹ� �迭 a�� �����ϸ� : ");
		copy(a,b);
		
		System.out.print("�迭 b�� ��� ��Ҹ� �迭 a�� �ݴ�� �����ϸ� : ");
		recopy(a,b);
		
	}	
}
