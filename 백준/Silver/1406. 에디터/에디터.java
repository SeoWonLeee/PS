import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String initialString = br.readLine();
        int M = Integer.parseInt(br.readLine());
        
        LinkedList<Character> left = new LinkedList<>();
        LinkedList<Character> right = new LinkedList<>();
        
        for (char c : initialString.toCharArray()) {
            left.add(c);
        }
        
        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            
            switch (command.charAt(0)) {
                case 'L':
                    if (!left.isEmpty()) {
                        right.addFirst(left.removeLast());
                    }
                    break;
                case 'D':
                    if (!right.isEmpty()) {
                        left.addLast(right.removeFirst());
                    }
                    break;
                case 'B':
                    if (!left.isEmpty()) {
                        left.removeLast();
                    }
                    break;
                case 'P':
                    char c = command.charAt(2);
                    left.addLast(c);
                    break;
            }
        }
        
        ListIterator<Character> it = left.listIterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        while (!right.isEmpty()) {
            sb.append(right.removeFirst());
        }
        
        System.out.println(sb.toString());
    }
}
