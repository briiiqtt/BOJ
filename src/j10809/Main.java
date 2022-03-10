package j10809;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<String> az = new ArrayList<>();
		for(int i = 97; i < 123; i++) {
			az.add(String.valueOf((char)i));
		}
		for(String c : az) {
			bw.write(s.indexOf(c)+" ");
		}
		
		bw.flush();
		bw.close();
		sc.close();

	}

}