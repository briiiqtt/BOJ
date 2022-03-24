package j1010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			String[] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);

			int answer = 0;
			if(N == 1)
				answer = M;
			
			if (N == M) {
				answer = 1;
			} else {
				
//				int head = M - N + 1;
//				
//				for (int j = 0; j < N - 1; j++) {
//					
//					for (int k = head; k > 0; k--) {
//						answer += k;
//					}
//					head--;
//				}
				
				
				
				

			}
			bw.write(answer + "\n");
		}
		bw.flush();
		bw.close();

	}

}
