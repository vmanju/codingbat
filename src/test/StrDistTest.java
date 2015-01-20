package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import recursion1.StrDist;

/**
 * 
 * @author arun.varadarajan
 * Expected	Run		
strDist("catcowcat", "cat") → 9	9	OK	    
strDist("catcowcat", "cow") → 3	3	OK	    
strDist("cccatcowcatxx", "cat") → 9	9	OK	    
strDist("abccatcowcatcatxyz", "cat") → 12	12	OK	    
strDist("xyx", "x") → 3	3	OK	    
strDist("xyx", "y") → 1	1	OK	    
strDist("xyx", "z") → 0	0	OK	    
strDist("z", "z") → 1	1	OK	    
strDist("x", "z") → 0	0	OK	    
strDist("", "z") → 0	0	OK	    
strDist("hiHellohihihi", "hi") → 13	13	OK	    
strDist("hiHellohihihi", "hih") → 5	5	OK	    
strDist("hiHellohihihi", "o") → 1	1	OK	    
strDist("hiHellohihihi", "ll") → 2	2	OK	    
other tests
OK	 
 */

public class StrDistTest {

	@Test
	public void testStrDistWithNullString() {
		assertEquals(StrDist.strDist("", "z"), 0);
	}

	@Test
	public void testStrDistWithValidString() {
		assertEquals(StrDist.strDist("catcowcat", "cat"), 9);
	}
	
	
}
