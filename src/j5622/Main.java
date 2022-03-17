package j5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int sum = 0;
		for(int i = 0; i<word.length(); i++) {
			int ascii = word.charAt(i);
			sum += getDialNumber(ascii)+1;
		}
		
		System.out.println(sum);
		
	}
	
	static int getDialNumber(int ascii) {
		if(ascii >= 65 && ascii <= 67)return 2;
		else if (ascii >= 68 && ascii <= 70)return 3;
		else if (ascii >= 71 && ascii <= 73)return 4;
		else if (ascii >= 74 && ascii <= 76)return 5;
		else if (ascii >= 77 && ascii <= 79)return 6;
		else if (ascii >= 80 && ascii <= 83)return 7;
		else if (ascii >= 84 && ascii <= 86)return 8;
		else if (ascii >= 87 && ascii <= 90)return 9;
		else return -1;
	}
	
}
