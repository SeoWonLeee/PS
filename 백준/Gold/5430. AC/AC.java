import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int T = Integer.parseInt(reader.readLine().trim());
        
        while (T-- > 0) {
            String p = reader.readLine().trim();
            int n = Integer.parseInt(reader.readLine().trim());
            String arrayInput = reader.readLine().trim();
            
            Deque<Integer> deque = new ArrayDeque<>();
            
            if (n > 0) {
                StringTokenizer st = new StringTokenizer(arrayInput.substring(1, arrayInput.length() - 1), ",");
                while (st.hasMoreTokens()) {
                    deque.addLast(Integer.parseInt(st.nextToken().trim()));
                }
            }
            
            boolean reversed = false;
            boolean error = false;

            for (char cmd : p.toCharArray()) {
                if (cmd == 'R') {
                    reversed = !reversed;
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reversed) {
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
                }
            }
            
            if (error) {
                result.append("error\n");
            } else {
                if (reversed) {
                    result.append("[");
                    while (!deque.isEmpty()) {
                        result.append(deque.removeLast());
                        if (!deque.isEmpty()) {
                            result.append(",");
                        }
                    }
                    result.append("]\n");
                } else {
                    result.append("[");
                    while (!deque.isEmpty()) {
                        result.append(deque.removeFirst());
                        if (!deque.isEmpty()) {
                            result.append(",");
                        }
                    }
                    result.append("]\n");
                }
            }
        }
        
        System.out.print(result);
    }
}
