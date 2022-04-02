package j2752;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int[] nums = new int[3];
		for (int i = 0; i < arr.length; i++) {
			nums[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(nums);
		for (int num : nums) {
			bw.write(num + " ");
		}
		bw.flush();
		bw.close();
	}

}
