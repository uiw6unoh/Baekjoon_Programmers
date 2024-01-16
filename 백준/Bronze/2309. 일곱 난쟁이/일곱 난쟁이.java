import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int[] arr = new int[9];
       int sum = 0;
       int spy1 = 0, spy2 = 0;
       for (int i = 0; i < arr.length; i++) {
           arr[i] = Integer.parseInt(br.readLine());
           sum += arr[i];
       }
       Arrays.sort(arr);
       for (int i = 0; i < arr.length - 1; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (sum - arr[i] - arr[j] == 100) {
                   spy1 = i;
                   spy2 = j;
                   break;
               }
           }
       }
       for (int i = 0; i < arr.length; i++) {
           if (i == spy1 || i == spy2)
               continue;
           System.out.println(arr[i]);
       }
       bw.flush();
       br.close();
       bw.close();
   }
}