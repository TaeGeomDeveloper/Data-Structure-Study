package 소수의나열;

/*
 * 				자바 자료구조 공부
 * 										윤태검
 * 				
 * 				1000 이하의 소수를 열거
 *
 */

 class PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0;		// 나눗셈의 횟수
		
		for (int n= 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if(n%i == 0)			// 나누어 떨어지면 소수가 아님
					break;
			}
			if(n==1)
				System.out.println(n);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : "+counter);
		
	}

}


