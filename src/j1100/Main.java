package j1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;

		for (int y = 0; y < 8; y++) {
			String[] s = br.readLine().split("");

			for (int x = 0; x < 8; x++) {
				if (isWhiteBlock(x, y)) {
					if (!isEmpty(s[x])) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}

	static boolean isWhiteBlock(int x, int y) {
		if (y == 0 || y == 2 || y == 4 || y == 6) {
			if (x == 0 || x == 2 || x == 4 || x == 6) {
				return true;
			}
		} else {
			if (!(x == 0 || x == 2 || x == 4 || x == 6)) {
				return true;
			}
		}
		return false;
	}

	static boolean isEmpty(String hiiiing) {
		if (hiiiing.equals("."))
			return true;
		else
			return false;
	}

}
