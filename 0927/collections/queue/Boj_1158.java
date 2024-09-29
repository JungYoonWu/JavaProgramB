package collections.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj_1158 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		LinkedList<Integer> que = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= N; i++) {
			que.offer(i);
		}
		
		bw.write("<");
		int queCnt = 0;
		while(que.size()>1) {
			queCnt++;
			if(queCnt % K != 0) {
				que.offer(que.poll());
			}else {
				bw.write(que.poll() + ", ");
			}
		}bw.write(que.poll()+">");
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
