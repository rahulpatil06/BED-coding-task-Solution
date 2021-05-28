package uk.co.wowcher;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCases {

	@Test
	public void testReadTime() {
		assertEquals("It's Midnight...!!", new ReadTime().readTimeValue(24, 00));
		assertEquals("It's Midday ..!!", new ReadTime().readTimeValue(12, 00));
		assertEquals("Please Enter the Proper Hour...", new ReadTime().readTimeValue(24, 01));
		assertEquals("Please Enter the Proper Hour...", new ReadTime().readTimeValue(34, 00));
		assertEquals("Please Enter the Proper Minute....", new ReadTime().readTimeValue(21, 86));
	}

	@Test
	public void TestDisplay() {
		assertEquals("It's twenty two ", new ReadTime().Display(22, 00));
		assertEquals("It's  nine", new ReadTime().Display(0, 9));
		assertEquals("It's twenty  twenty ", new ReadTime().Display(20, 20));
		assertEquals("It's fifteen forty ", new ReadTime().Display(15, 40));
	}
}
