package j1292;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] xy = br.readLine().split(" ");
		int x = Integer.parseInt(xy[0]);
		int y = Integer.parseInt(xy[1]);

		int sum = 0;
		int n = 1;
		int pointer = 1;
		for (int j = 0; j < y; j++) {
			for (int i = 0; i < n; i++) {
				if (pointer >= x && pointer <= y) {
					sum += n;
				}
				pointer++;
			}
			n++;
		}
		bw.write(sum + "\n");
		bw.flush();
		bw.close();
	}
}
