package �Ҽ��ǳ���;

/*
 * 				�ڹ� �ڷᱸ�� ����
 * 										���°�
 * 				
 * 				1000 ������ �Ҽ��� ���� v3
 *
 */

public class PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0; 						// �������� Ƚ��
		int ptr = 0;							// ã�� �Ҽ��� ����
		int[] prime = new int[500];				// �Ҽ��� �����ϴ� �迭
		
		prime[ptr++] = 2;				
		prime[ptr++] = 3;				

		System.out.println(prime[0]);
		
		for (int n = 5; n <= 1000; n+= 2) {		// ����� Ȧ����
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if (n % prime[i] == 0) {			// ������ �������� �Ҽ��� �ƴ�
					flag = true;
					break;
				}
			}
			if (!flag) {						// ���������� ������ �������� ����.
				counter++;
				prime[ptr++] = n;				// �Ҽ���� �迭�� ����
			}
		}
		
		for(int i = 0; i < ptr; i++)			// ã�� ptr ���� �Ҽ��� ��Ÿ��
			System.out.println(prime[i]);			

		System.out.println("�������� ������ Ƚ�� : " + counter);
	}

}
