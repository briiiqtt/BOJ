package j4673;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10000; i++) {
			storeNonSelfNumber(i, list);
		}

		for (int i = 0; i < 10000; i++) {
			if (!isNotSelfNumber(i, list)) {
				bw.write(i+"\n");
			}
		}
		
		bw.flush();
		bw.close();

	}

	static void storeNonSelfNumber(int i, List<Integer> list) {
		String numStr = i + "";
		int num = i;
		for (int j = 0; j < numStr.length(); j++) {
			num += Integer.parseInt(numStr.substring(j, j + 1));
		}
		list.add(num);

	}

	static boolean isNotSelfNumber(int i, List<Integer> list) {
		for (int j : list) {
			if (j == i) return true;
		}
		return false;
	}

}
