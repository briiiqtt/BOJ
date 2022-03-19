package j1924;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] xy = br.readLine().split(" ");
		int x = Integer.parseInt(xy[0]);
		int y = Integer.parseInt(xy[1]);
		int dayCountAfterJan1st = 0;
		dayCountAfterJan1st = getDayCountAfterJan1st(x, y);

		String day = getDayOfWeek(dayCountAfterJan1st);
		bw.write(day + "");
		bw.flush();
		bw.close();
	}

	static int getDayCountAfterJan1st(int month, int day) {
		if (month != 1) {
			for (int i = 1; i < month; i++) {
				day += monthToDays(i);
			}
		}
		return day;
	}

	static int monthToDays(int month) {
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else if (month == 2)
			return 28;
		else
			return 31;
	}

	static String getDayOfWeek(int dayCountAfterJan1st) {
		switch (dayCountAfterJan1st % 7) {
		case 0:
			return "SUN";
		case 1:
			return "MON";
		case 2:
			return "TUE";
		case 3:
			return "WED";
		case 4:
			return "THU";
		case 5:
			return "FRI";
		case 6:
			return "SAT";
		default:
			return null;
		}
	}

}
