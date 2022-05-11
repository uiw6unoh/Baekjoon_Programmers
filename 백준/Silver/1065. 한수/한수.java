import java.util.Scanner;

class Han {
	int count;
	
	public Han() {
	}
	
	public int countHan(int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
			int hun = arr[i] / 100;
			int ten = arr[i] % 100 / 10;
			int one = arr[i] % 10;
			if(arr[i] < 100) {
				count++;
			}
			if(arr[i] > 100) {
				if ((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
}

public class Main {
	 public static void main(String[] args) {
	       Han han = new Han();
	        Scanner sc = new Scanner(System.in);
	        han.countHan(sc.nextInt());
	        System.out.println(han.count);
	        
	        sc.close();
	 }
}