import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        int max = -100;
        int count = 0; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();   
            if (arr[i] > max) { 
                max = arr[i]; 

                count = i + 1; 
            }
        }
        System.out.println(max +" "+ count);

        sc.close();
	}
}