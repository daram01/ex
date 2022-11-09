package work;

public class Ex3_2 {

	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 갯수
		int sizeOfBucket = 10; // 바구니의 크기
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
		// 사과의갯수 / 바구니의 크기 + (사과의 갯수를 바구니의 크기로 나눴을 때, 0 이상이면 +1, 0이면 +0)
		// 123%10 = 나머지가 3이므로 0 이상이기 때문에 +1을 반환한다.
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
		//사과의 개수를 바구니의 크기로 나눗셈연산을 하면
		//사과를 담는데 필요한 바구니의 수를 구할 수 있다.
	}
}
