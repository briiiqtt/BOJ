package j1270;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < n; j++) {
			String[] arr = br.readLine().split(" ");
			List<String> nums = new ArrayList<>();
			for(int i = 1; i < arr.length; i++) {
				nums.add(arr[i]);
			}
			
			Set<String> set = new HashSet<>();
			for(int i = 0; i < nums.size(); i++) {
				set.add(nums.get(i));
			}
	
			Map<String,Integer> map = new HashMap<>();
			for(int i = 0; i < nums.size(); i++) {
				if(set.contains(nums.get(i))) {
					if(!map.containsKey(nums.get(i)))map.put(nums.get(i), 0);
					map.put(nums.get(i), map.get(nums.get(i))+1);
				}
			}
			
			boolean conquered = false;
			String army = "";
			for(int i = 0; i < nums.size(); i++) {
				if(nums.size()/2 < map.get(nums.get(i))) {
					conquered = true;
					army = nums.get(i);
					break;
				}
			}
			System.out.println(conquered ? army : "SYJKGW");
		}
		
	}

}
