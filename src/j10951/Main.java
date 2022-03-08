package j10951;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean eof = false;
		while (!eof) {
			String T = br.readLine();
			if(T==null) {
				eof = true;
				continue;
			}
			
			int A = Integer.parseInt(T.split(" ")[0]);
			int B = Integer.parseInt(T.split(" ")[1]);
			int sum = A + B;

			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}

}