import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 카드 수 N
        int m = Integer.parseInt(st.nextToken()); // 딜러 수 M

        int[] card = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (result < sum && sum <= m) {
                        result = sum;
                    }
                }
            }
        }
        System.out.print(result);
    }
}