package j1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


	public static void main(String[] args) throws IOException {

		List<Map<String, Object>> word = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();

		for (int i = 0; i < S.length(); i++) {
			String letter = S.substring(i, i + 1).toUpperCase();
			if (!isLetterAlreadyExists(word, letter))
				newLetter(word, letter);
		}

		System.out.println(getLetterWhoHasMaxVal(word));

	}

	static boolean isLetterAlreadyExists(List<Map<String, Object>> word, String letter) {

		for (Map<String, Object> map : word) {
			if (map.get("letter").equals(letter)) {
				map.put("count", (Integer) map.get("count") + 1);
				return true;
			}
		}
		return false;
	}

	static void newLetter(List<Map<String, Object>> word, String letter) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("letter", letter);
		map.put("count", 1);
		word.add(map);

	}
	
	static String getLetterWhoHasMaxVal(List<Map<String, Object>> word) {
		int maxCnt = 0;
		String maxStr = "";
		for(Map<String, Object> map : word) {
			int cnt = (Integer)map.get("count");
			if(maxCnt<cnt) {
				maxCnt = cnt;
				maxStr = (String)map.get("letter");
			} else if(maxCnt==cnt) {
				maxStr = "?";
			}
		}
		return maxStr;
	}
}
