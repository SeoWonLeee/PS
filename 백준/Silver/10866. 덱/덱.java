import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            switch (command) {
                case "push_front":
                    int xFront = Integer.parseInt(st.nextToken());
                    deque.addFirst(xFront);
                    break;
                    
                case "push_back":
                    int xBack = Integer.parseInt(st.nextToken());
                    deque.addLast(xBack);
                    break;
                    
                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.pollFirst() + "\n");
                    }
                    break;
                    
                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.pollLast() + "\n");
                    }
                    break;
                    
                case "size":
                    sb.append(deque.size() + "\n");
                    break;
                    
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                    
                case "front":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekFirst() + "\n");
                    }
                    break;
                    
                case "back":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekLast() + "\n");
                    }
                    break;
            }
        }
        
        System.out.print(sb.toString());
    }
}
