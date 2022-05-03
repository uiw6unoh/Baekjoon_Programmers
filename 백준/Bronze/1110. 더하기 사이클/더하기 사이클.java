import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 처음 주어진 수 또는 새로운 수
		sc.close();

		int copy = N; // 처음 주어진 수를 복사해둠.
		int count = 0;

		while (true) {

			N = ((N % 10) * 10) + ((N / 10 + N % 10) % 10); // T의 십의 자릿수 + T의 일의 자릿수
			count++; // 사이클 갯수 세기

			// 처음 주어진 수와 새로운 수가 같을 경우, 반복문 종료
			if (copy == N) {
				break;
			}
		}
		System.out.println(count);
	}
}