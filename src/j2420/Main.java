package j2420;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nm = br.readLine().split(" ");
		long n = Long.parseLong(nm[0]);
		long m = Long.parseLong(nm[1]);
		if (n < 0)
			n = n * -1;
		if (m < 0)
			m = m * -1;
		bw.write(n + m + "\n");
		bw.flush();
		bw.close();

	}

}
