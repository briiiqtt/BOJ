package j2839;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		bw.write(getMinimalBongjiCount(n) + "");
		bw.flush();
		bw.close();

	}

	static int getMinimalBongjiCount(int n) {
		try {
			int fiveKg = get5kgCount(n);
			int threeKg = get3kgCount(n, fiveKg);
			return fiveKg + threeKg;
		} catch (BongjiException e) {
			return -1;
		}
	}

	static int get5kgCount(int n) {
		for (int bongji = n / 5; bongji >= 0; bongji--) {
			if ((n - 5 * bongji) % 3 == 0) {
				return bongji;
			}
		}
		throw new BongjiException();
	}

	static int get3kgCount(int n, int fiveKg) {
		return (n - 5 * fiveKg) / 3;
	}

}

class BongjiException extends RuntimeException {

}