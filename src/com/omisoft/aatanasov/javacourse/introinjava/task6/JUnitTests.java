package com.omisoft.aatanasov.javacourse.introinjava.task6;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTests {
	
	@Test
	public void summarizerTest_5_6_11() {
        Summarizer summarizer = new Summarizer();
        String sum = summarizer.summarizeNumberStrings("5", "6");
        assertEquals("11", sum);
	}

	@Test
	public void summarizerTest_1099_1_11000() {
        Summarizer summarizer = new Summarizer();
        String sum = summarizer.summarizeNumberStrings("1", "10999");
        assertEquals("11000", sum);
	}
	
	@Test
	public void summarizerTest_4738_929276_934014() {
        Summarizer summarizer = new Summarizer();
        String sum = summarizer.summarizeNumberStrings("4738", "929276");
        assertEquals("934014", sum);
	}
	
	@Test
	public void summarizerTest_decimalValues() {
        Summarizer summarizer = new Summarizer();
        String sum = summarizer.summarizeNumberStrings("5.5", "1"); // a == 97, b == 98 
        assertEquals("6.5", sum);
	}
	
	@Test
	public void summarizerTest_negativeValue() {
        Summarizer summarizer = new Summarizer();
        String sum = summarizer.summarizeNumberStrings("-1", "5"); // a == 97, b == 98 
        assertEquals("4", sum);
	}
	
	@Test
	public void summarizerTest_bothNegativeValues() {
        Summarizer summarizer = new Summarizer();
        String sum = summarizer.summarizeNumberStrings("-5", "-1"); // a == 97, b == 98 
        assertEquals("-6", sum);
	}

}
