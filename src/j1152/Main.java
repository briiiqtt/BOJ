package j1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		if(!sentence.equals(" ")) {
			if (sentence.substring(0, 1).equals(" ")) sentence = sentence.substring(1, sentence.length());
			if (sentence.substring(sentence.length() - 1, sentence.length()).equals(" ")) sentence = sentence.substring(0, sentence.length() - 1);
		}
		String[] words = sentence.split(" ");
		System.out.println(words.length);
	}

}
