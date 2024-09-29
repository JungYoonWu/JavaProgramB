package collections.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Boj_9012 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			
			char[] charArr = br.readLine().toCharArray();
			Stack<Character> vps= new Stack<>();
			boolean checkVPS = true;
			
			for(char ch : charArr) {
				if(ch == '(') {
					vps.push(ch);
				}else if(ch == ')') {
					if(vps.isEmpty()) {
						checkVPS = false;
						break;
					}
					if(vps.peek() == '(') {
						vps.pop();
					}else {
						checkVPS = false;
						break;
					}
				}
			}
			if(checkVPS && !vps.isEmpty()) {
				checkVPS = false;
			}
			
			bw.write(checkVPS ? "YES\n" : "NO\n");

		}
		bw.flush();
		bw.close();
		br.close();
	}
}

