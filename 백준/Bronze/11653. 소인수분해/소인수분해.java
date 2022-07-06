import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		if(number == 1) {
		}else {
			for(int i = 2; i < 10000000; i++) {
				for(int j = 2; j < 10000000; j++) {
					if(number % j == 0) {
						number = number / j;
						System.out.println(j);
                        
						break;
					}
				}
				if(number ==1 ) {
                    
					break;
				}
			}
		}		
	}}