package collections.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1966Mk4 {
	
	static class Document{	
		int index;
		int importance;

		public Document(int index, int importance) {
			this.index = index;
			this.importance = importance;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        int testNum = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < testNum; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
        	int printNum = Integer.parseInt(st.nextToken());
        	int targetIndex = Integer.parseInt(st.nextToken());
        	
        	Queue<Document> que = new LinkedList<>();
        	PriorityQueue<Integer> priQue = new PriorityQueue<>(Comparator.reverseOrder());
        	
        	st = new StringTokenizer(br.readLine()," ");
        	for(int j = 0; j < printNum; j++) {
        		int importance = Integer.parseInt(st.nextToken());
        		que.offer(new Document(j, importance));
        		priQue.offer(importance);
        	}
        	
        	int cntPrint = 0;
        	while(!que.isEmpty()) {
        		Document curDoc = que.poll();
        		
        		if(curDoc.importance == priQue.peek()) {
        			priQue.poll();
        			cntPrint++;
        			
        			if(curDoc.index == targetIndex) {
        				bw.write(cntPrint + "\n");
        				break;
        			}
        		}else {
        			que.offer(curDoc);
        		}
        		
        	}
        }
        bw.flush();
        bw.close();
        br.close();
	}
}
