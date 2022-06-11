import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 인출할 사람의 수 입력 받음
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int timeSum = 0;
		int result = 0;
		int[] time = new int[n];
		
		// 인출할 때 걸리는 시간 입력 받음
		for (int i = 0; i < n; i++) {
			time[i] = in.nextInt();
		}
	
		// 오름차순 순서대로 정렬
		Arrays.sort(time);
		int[] sum = new int[time.length];
		
		// 정렬된 시간의 합을 리스트에 넣음
		for (int i = 0; i < time.length; i++) {
			timeSum += time[i];
			sum[i] = timeSum;
		}
		
		// 리스트에 넣은 시간의 합을 다 더해서 출력
		for (int i = 0; i < sum.length; i++) {
			result += sum[i];
		}
		System.out.println(result);
	
		in.close();
	}
}