package j1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ABC = br.readLine().split(" ");
		int A = Integer.parseInt(ABC[0]);
		int B = Integer.parseInt(ABC[1]);
		int C = Integer.parseInt(ABC[2]);

		long breakEven = -1;
		if (B < C) {
			for (long i = 0; true; i++) {
				if (A + B * i < C * i) {
					breakEven = i;
					break;
				}
			}
		}
		System.out.println(breakEven);
	}

}