package �迭�ִ밪;

/*
 * 				�ڹ� �ڷᱸ�� ����
 * 										���°�
 * 				
 * 				�⺻ �迭
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
		
		System.out.println("Ű�� �ִ��� ���մϴ�. ");
		System.out.print("����� �� : ");
		int num = stdin.nextInt();			//	�迭�� ��ڼ��� �Է� ����.
		
		int height[] = new int[num];		// ��ڼ��� num �� �迭�� ����
		
		for(int i= 0; i< num; i++) {
			System.out.print("height["+i+"]: ");
			height[i] = stdin.nextInt();
		}
		
		System.out.println("�ִ밪�� "+maxOf(height)+"�Դϴ�.");
		
		
		System.out.println("���� Ű�� �ִ��� ���մϴ�. ");
		System.out.print("����� �� : ");
		int num2 = stdin.nextInt();			//	�迭�� ��ڼ��� �Է� ����.
		
		int height2[] = new int[num2];		// ��ڼ��� num �� �迭�� ����
		
		for(int i= 0; i< num; i++) {
			System.out.print("height2["+i+"]: ");
			height2[i] = 100 + rand.nextInt(90);
			System.out.println(height2[i]);
		}
		System.out.println("�ִ밪�� "+maxOf(height2)+"�Դϴ�.");
	}

}
