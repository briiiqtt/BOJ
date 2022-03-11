package j2675;

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
			String[] RS = br.readLine().split(" ");
			int R = Integer.parseInt(RS[0]);
			String S = RS[1];

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					bw.write(S.substring(j, j + 1));
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

}
