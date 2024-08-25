import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder result = new StringBuilder("<");
        int index = 0;

        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size();
            result.append(list.remove(index));
            if (!list.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result.toString());
    }
}
