package uk.co.wowcher;

public class ReadTime {
	public String Display(int h, int m) {
		final String str[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"Eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		final String tens[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty" };
		String hr = "";
		String min = "";
		if (h < 20) {
			hr += str[h];
		} else {
			hr += tens[h / 10] + " " + str[h % 10];
		}
		if (m < 20) {
			min += str[m];
		} else {
			min += tens[m / 10] + " " + str[m % 10];
		}
		return "It's " + hr + " " + min;
	}

	public String readTimeValue(int hour, int min) {
		if (hour > 24 || hour < 0) {
			return "Please Enter the Proper Hour...";
		} else if (min > 60 || min < 0) {
			return "Please Enter the Proper Minute....";
		} else if (hour == 24 && min > 0) {
			return "Please Enter the Proper Hour...";
		}
		if (min == 60) {
			hour = hour + 1;
			min = 0;
		}
		if (hour == 24 && min == 0) {
			hour = 0;
		}
		if (hour == 0 && min == 0) {
			return "It's Midnight...!!";
		} else if (hour == 12 && min == 0) {
			return "It's Midday ..!!";
		} else {
			return Display(hour, min);
		}
	}
}
