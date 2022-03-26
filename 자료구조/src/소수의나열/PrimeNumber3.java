package 소수의나열;

/*
 * 				자바 자료구조 공부
 * 										윤태검
 * 				
 * 				1000 이하의 소수를 열거 v3
 *
 */

public class PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0; 						// 나눗셈의 횟수
		int ptr = 0;							// 찾은 소수의 개수
		int[] prime = new int[500];				// 소수를 저장하는 배열
		
		prime[ptr++] = 2;				
		prime[ptr++] = 3;				

		System.out.println(prime[0]);
		
		for (int n = 5; n <= 1000; n+= 2) {		// 대상은 홀수만
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if (n % prime[i] == 0) {			// 나누어 떨어지면 소수가 아님
					flag = true;
					break;
				}
			}
			if (!flag) {						// 마지막까지 나누어 떨어지지 않음.
				counter++;
				prime[ptr++] = n;				// 소수라고 배열에 저장
			}
		}
		
		for(int i = 0; i < ptr; i++)			// 찾은 ptr 개의 소수를 나타냄
			System.out.println(prime[i]);			

		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
