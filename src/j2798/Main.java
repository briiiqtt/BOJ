package j2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");

		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);

		String[] cardsString = br.readLine().split(" ");
		ArrayList<Integer> cards = new ArrayList<>();
		for (String card : cardsString) {
			cards.add(Integer.parseInt(card));
		}
		
		int maxSum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if(!(i==j||i==k||j==k)) {
						int sum = cards.get(i)+cards.get(j)+cards.get(k);
						if(sum>maxSum && sum<=M) {
							maxSum = sum;
						}
					}
				}
			}
		}
		System.out.println(maxSum);
	}
}
