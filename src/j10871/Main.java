package j10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String nx = br.readLine();
		int n = Integer.parseInt(nx.split(" ")[0]);
		int x = Integer.parseInt(nx.split(" ")[1]);
		String[] arr = br.readLine().split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i<n; i++) {
			int a = Integer.parseInt(arr[i]);
			if(a<x)
				result.append(a+" "); //FIXME 마지막 공백 체크
		}
		bw.write(result+"\n");
		bw.flush();
		bw.close();
		
	}
	
}