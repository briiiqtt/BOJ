package j1085;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] xywh = br.readLine().split(" ");

		int x = Integer.parseInt(xywh[0]);
		int y = Integer.parseInt(xywh[1]);
		int w = Integer.parseInt(xywh[2]);
		int h = Integer.parseInt(xywh[3]);

		System.out.println(getShortestDistance(x, y, w, h));

	}

	static int getShortestDistance(int x, int y, int w, int h) {

		int[] ways = { x, y, w - x, h - y };
		int min = x;
		for (int i : ways) {
			if (min > i) {
				min = i;
			}
		}
		return min;

	}

}
