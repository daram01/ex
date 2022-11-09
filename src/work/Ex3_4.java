package work;

public class Ex3_4 {

	public static void main(String[] args) {
		//num값 중에서 백의 자리 이하를 버리는 코드를 만들어라.
		//num의 값이 456이라면 400이 되고, 111라면 100이된다.
		int num = 456;
		System.out.println(num/100*100);
		// 456 / 100을 하면 4.56이 나오는데 나눗셈 연산자는 
		// 반올림을 하지 않고 버리기 때문에 4가 되고, 거기에 100을 곱해서
		// 400이 나오게 된다.
	}

}
