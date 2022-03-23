package j4344;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int c = Integer.parseInt(br.readLine());
		for (int i = 0; i < c; i++) {
			String[] line = br.readLine().split(" ");
			List<Integer> scores = new ArrayList<>();
			for (int j = 1; j < line.length; j++) {
				scores.add(Integer.parseInt(line[j]));
			}

			int sum = getScoreSum(scores);
			double avg = (double) sum / scores.size();
			int studentsAboveAvg = getStudentsCntAboveAvg(scores, avg);
			double beyondAvgRate = studentsAboveAvg / (double) scores.size() * 100;
			
			bw.write(getFormattedRate(beyondAvgRate)+"\n");
		}
		bw.flush();
		bw.close();

	}
	
	static int getScoreSum(List<Integer> scores) {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return sum;
	}
	
	static int getStudentsCntAboveAvg(List<Integer> scores, double avg) {
		int std = 0;
		for (int score : scores) {
			if (score > avg) {
				std++;
			}
		}
		return std;
	}
	
	static String getFormattedRate(double beyondAvgRate) {
		return String.format("%.3f", beyondAvgRate)+"%";
	}

}
