import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int binarySearch(int[] arr, int n)
	{
		int start = 0;
		int end = arr.length-1;
		int middle = 0;
		
		while(start <= end)
		{
			middle = (start + end)/2;
			if(arr[middle] == n)
			{
				return 1;
			}
			else
			{
				if(arr[middle] > n)
				{
					end = middle-1;
				}
				else
				{
					start = middle+1;
				}
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] card = new int[N];
		for(int i = 0; i < N; i++)
		{
			card[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] search = new int[M];
		for(int i = 0; i < M; i++)
		{
			search[i] = sc.nextInt();
		}
		
		Arrays.sort(card);
		
		for(int i = 0; i < M; i++)
		{
			int a = binarySearch(card, search[i]);
			System.out.print(a + " ");
		}

	}

}