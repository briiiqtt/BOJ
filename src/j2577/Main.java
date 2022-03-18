package j2577;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int mul = A * B * C;
		String num = mul + "";
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < 10; i++) {
			map.put(i+"", 0);
		}

		for (int i = 0; i < num.length(); i++) {
			String n = num.substring(i, i + 1);
				map.put(n, map.get(n) + 1);
		}

		for(int i = 0; i < 10; i++) {
			bw.write(map.get(i+"")+"\n");
		}
		bw.flush();
		bw.close();

	}

}
