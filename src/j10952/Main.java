package j10952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean zero = false;
		while (!zero) {
			String T = br.readLine();

			int A = Integer.parseInt(T.split(" ")[0]);
			int B = Integer.parseInt(T.split(" ")[1]);
			int sum = A + B;

			if(sum!=0) {
				bw.write(sum + "\n");
			} else {
				zero = true;
			}
		}
		bw.flush();
		bw.close();
	}

}
