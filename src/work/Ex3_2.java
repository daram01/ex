package work;

public class Ex3_2 {

	public static void main(String[] args) {
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
		// ����ǰ��� / �ٱ����� ũ�� + (����� ������ �ٱ����� ũ��� ������ ��, 0 �̻��̸� +1, 0�̸� +0)
		// 123%10 = �������� 3�̹Ƿ� 0 �̻��̱� ������ +1�� ��ȯ�Ѵ�.
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
		
		//����� ������ �ٱ����� ũ��� ������������ �ϸ�
		//����� ��µ� �ʿ��� �ٱ����� ���� ���� �� �ִ�.
	}
}
