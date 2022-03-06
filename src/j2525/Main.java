package j2525;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String timeNow = br.readLine();
		int hh = Integer.parseInt(timeNow.split(" ")[0]);
		int mm = Integer.parseInt(timeNow.split(" ")[1]);
		int timeDur = Integer.parseInt(br.readLine());

		for (int i = 0; i < timeDur; i++) {
			if (mm < 59)
				mm++;
			else {
				mm = 0;
				hh++;
				if(hh>23)
					hh=0;
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(hh + " " + mm);
		bw.flush();
		bw.close();
	}
}
