import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_price = Integer.parseInt(br.readLine());
        int kind_count = Integer.parseInt(br.readLine());

        int price = 0;
        int count = 0;
        int total = 0;

        for (int i = 0; i < kind_count; i++) {
          // 물건 종류 만큼 입력 받음
          String inp = br.readLine();
          StringTokenizer st = new StringTokenizer(inp, " ");
          price = Integer.parseInt(st.nextToken());
          count = Integer.parseInt(st.nextToken());
          total += price * count;
        }
        if (total != total_price) {
          System.out.print("No");
        } else {
          System.out.print("Yes");
        }
        br.close();
    }
}
