package �⺻�迭;

/*
 * 				�ڹ� �ڷᱸ�� ����
 * 										���°�
 * 				
 * 				�⺻ �迭
 */

class IntArray {

	public static void main(String[] args) {
		int a[] = new int[5];		// �迭�� ����
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1]*2;
		
		for(int i = 0; i < a.length; i++)	// ����� �� ��
			System.out.println("a["+i+"] = "+a[i]);
	
		System.out.println();
		
		int b[] = {1,2,3,4,5};	// �迭 �ʱ�ȭ
	
		for(int i = 0; i < b.length; i++)	// ����� �� ��
			System.out.println("b["+i+"] = "+b[i]);
		
		System.out.println();
		
		int c[] = b.clone();
		
		c[3] = 0;
		for(int i = 0; i < c.length; i++)	// ����� �� ��
			System.out.println("c["+i+"] = "+c[i]);
		
	}

}
