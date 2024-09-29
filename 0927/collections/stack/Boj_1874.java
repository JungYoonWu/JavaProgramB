package collections.stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Boj_1874 {

	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> sequence = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int start = 0;
		for(int i = 0; i < n; i++) {
			int pushNum = Integer.parseInt(br.readLine());
			
			if(start < pushNum) {
				for(int num = start+1; num <= pushNum; num++) {
					sequence.push(num);
					sb.append("+\n");
//					bw.write("+\n");
				}
				start = pushNum;
			}else if(sequence.peek() != pushNum) {
				System.out.print("NO");
				return;
			}
			sequence.pop();
//			bw.write("-\n");
			sb.append("-\n");
		}
		
		System.out.print(sb);
		br.close();
	}
}
