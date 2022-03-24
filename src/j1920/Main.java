package j1920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		List<Integer> nList = new ArrayList<>();
		List<Integer> mList = new ArrayList<>();

		String[] nums1 = br.readLine().split(" ");
		Arrays.sort(nums1);

		for (String num : nums1) {
			nList.add(Integer.parseInt(num));
		}

		int m = Integer.parseInt(br.readLine());
		String[] nums2 = br.readLine().split(" ");
		for (String num : nums2) {
			mList.add(Integer.parseInt(num));
		}

		for (int num : mList) {
			bw.write(search(num, nList) + "\n");
		}
		bw.flush();
		bw.close();

	}

	static int search(int val, List<Integer> list) {
		int midIdx;
		int minIdx = 0;
		int maxIdx = list.size()-1;
		
		while(minIdx<=maxIdx) {
			midIdx = (minIdx + maxIdx) / 2;
			
			if(val < list.get(midIdx)) {
				maxIdx = midIdx - 1;
			} else if (val > list.get(midIdx)) {
				minIdx = midIdx + 1;
			} else {
				return 1;
			}
		}
		return 0;

	}
}
