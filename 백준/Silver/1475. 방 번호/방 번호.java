import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String room = br.readLine();
        int count[] = new int[10];
        
        for(int i=0; i<room.length(); i++) {
            int n = room.charAt(i) - '0';
            count[n]++;
        }
        
        int SixNineCount = (count[6] + count[9] + 1)/2;
        
        int maxCount = 0;
        for(int i=0; i<=9; i++) {
            if(i!=6 && i!=9) {
                maxCount = Math.max(maxCount, count[i]);
            }
        }
        
        bw.write(String.valueOf(Math.max(SixNineCount, maxCount)));
        bw.flush();
    }
}