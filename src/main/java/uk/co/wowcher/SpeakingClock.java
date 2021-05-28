package uk.co.wowcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeakingClock {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the Time in Hour : Minute format");
		int n = 1;
		while (n != 0) {
			try {
				String time = br.readLine();
				String str[] = time.trim().split(":");
				ReadTime rd = new ReadTime();
				System.out.println(rd.readTimeValue(Integer.parseInt(str[0].trim()), Integer.parseInt(str[1].trim())));
				System.out.println("Please Enter the 0 to Exit..... Press Any Number To Continue");
				n = Integer.parseInt(br.readLine());
				if( n == 0) {
					return;
				}
				System.out.println("Please Enter the Time in Hour : Minute format");
			} catch (Exception e) {
				System.out.println("Please Enter the Proper Time Format...!!!");
			}
		}
	}
}
