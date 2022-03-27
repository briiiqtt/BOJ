package j5543;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> burgers = new ArrayList<>();
		List<Integer> beverages = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			burgers.add(Integer.parseInt(br.readLine()));
		}
		for(int i = 0; i < 2; i++) {
			beverages.add(Integer.parseInt(br.readLine()));
		}
		int burgerMin = burgers.get(0);
		int beverageMin = beverages.get(0);
		for(int bg : burgers) {
			if(burgerMin > bg) {
				burgerMin = bg;
			}
		}
		for(int bv: beverages) {
			if(beverageMin > bv) {
				beverageMin = bv;
			}
		}

		bw.write(burgerMin+beverageMin-50+"\n");
		bw.flush();
		bw.close();
	}
	
}
