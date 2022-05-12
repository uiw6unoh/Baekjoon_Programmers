import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] num = new int[26];
		
		for (int i = 0; i < 26; i++) {
			num[i] = -1;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (num[s.charAt(i) - 97] == -1) {
				num[s.charAt(i) - 97] = i;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(num[i] + " ");
		}
		
		sc.close();
	}
}