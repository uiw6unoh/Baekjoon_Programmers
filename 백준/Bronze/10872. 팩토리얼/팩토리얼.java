import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int factorial = sc.nextInt();
		int sum = 1;

		for(int i = factorial; factorial > 1; factorial--) {
			sum = sum * factorial;
		}
		System.out.println(sum);
	}   
}