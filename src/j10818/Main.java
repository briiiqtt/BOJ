package j10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		String[] nums =br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(nums[i]));
		}
		
		int max = 0;
		int min = list.get(0);
		
		for(int num : list) {
			if(num>max)max=num;
			if(num<min)min=num;
		}
		
		System.out.println(min+" "+max);
		
	}

}
