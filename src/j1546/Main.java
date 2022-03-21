package j1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] scoresStr = br.readLine().split(" ");
		List<Integer> scores = new ArrayList<>();
		List<Double> modifiedScores = new ArrayList<>();
		for(String s : scoresStr) {
			scores.add(Integer.parseInt(s));
		}
		
		int m = getMaxScore(scores);
		
		modifiedScores = getModifiedScores(m, scores);
		
		double avg = getAverageScore(modifiedScores);
		
		System.out.println(avg);
	}
		
	
	static int getMaxScore(List<Integer> scores) {
		int m = scores.get(0);
		for(int s : scores) {
			if(m<s)m=s;
		}
		return m;
	}
	
	static List<Double> getModifiedScores(int m, List<Integer> scores) {
		List<Double> list = new ArrayList<>();
		for(int i = 0; i < scores.size(); i++) {
			list.add((double)scores.get(i) / m * 100);
		}
		return list;
	}
	
	static Double getAverageScore(List<Double> modifiedScores) {
		double sum = 0;
		for(double score : modifiedScores) {
			sum += score; 
		}
		return sum/modifiedScores.size();
	}
	
}
