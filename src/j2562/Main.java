package j2562;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 9; i++) {
			list.add(sc.nextInt());
		}
		int max = list.get(0);
		int idx = 0;
		for(int i = 0; i < list.size(); i++) {
			if(max<list.get(i)) {
				max=list.get(i);
				idx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(idx+1);
		sc.close();
	}

}
