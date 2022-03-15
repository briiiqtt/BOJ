package j1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int divCnt = Integer.parseInt(br.readLine());
		
		String[] divisors = br.readLine().split(" ");
		List<Integer> divs = new ArrayList<>();
		for (String dvs : divisors) {
			divs.add(Integer.parseInt(dvs));
		}
		
		int max = divs.get(0);
		int min = divs.get(0);
		for (int d : divs) {
			if(max<d)max=d;
			if(min>d)min=d;
		}
		System.out.println(max*min);
		
	}
	
}


//public class Main {
//
//	public static void main(String[] args) throws IOException {
//
//		Scanner sc = new Scanner(System.in);
//		int divCnt = sc.nextInt();
//
//		List<Integer> divs = new ArrayList<>();
//		for(int i = 0; i < divCnt; i++) {
//			divs.add(sc.nextInt());
//		}
//		
//		int max = divs.get(0);
//		int min = divs.get(0);
//		for (int d : divs) {
//			if(max<d)max=d;
//			if(min>d)min=d;
//		}
//		System.out.println(max*min);
//		sc.close();
//	}
//
//}