package work;

public class Ex4_2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 20 ; i++) {
			if(i%2!=0 && i%3!=0) {
			// 1 을 2로 나눴을 떄 나머지 값이 0이 아니거나 1 을 3으로 나눴을 때  0이 아니면 sum에 i를 더함
			// 1 % 2 = 0이 아님 1 % 3 = 0이 아님 *
			// 2 % 2 = 0 그리고 2 % 3 = 0이 아님
			// 3 % 2 = 0이 아님 3 % 3 = 0
			// 4 % 2 = 0 4 % 3 = 0이 아님
			// 5 % 2 = 0이 아님 5 % 3 = 0이 아님 *
			// ... 6 % 2 = 0 6 % 3 = 0
			// % 연산자 : 두 수를 나눈 후 나머지를 반환한다.
			// && 연산자 : 두가지 조건 모두 참일때만 참
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
	}

}
