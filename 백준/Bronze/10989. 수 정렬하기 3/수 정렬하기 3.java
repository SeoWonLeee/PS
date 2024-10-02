import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                pw.println(i);
                count[i]--;
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
