package recursion1;

/*
 * 
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them. 

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0

Expected	Run		
countHi2("ahixhi") → 1	1	OK	    
countHi2("ahibhi") → 2	2	OK	    
countHi2("xhixhi") → 0	0	OK	    
countHi2("hixhi") → 1	1	OK	    
countHi2("hixhhi") → 2	2	OK	    
countHi2("hihihi") → 3	3	OK	    
countHi2("hihihix") → 3	3	OK	    
countHi2("xhihihix") → 2	2	OK	    
countHi2("xxhi") → 0	0	OK	    
countHi2("hixxhi") → 1	1	OK	    
countHi2("hi") → 1	1	OK	    
countHi2("xxxx") → 0	0	OK	    
countHi2("h") → 0	0	OK	    
countHi2("x") → 0	0	OK	    
countHi2("") → 0	0	OK	    
countHi2("Hellohi") → 1	1	OK
 */
public class CountHi2 {

	public int countHi2(String str) {
		if (str.length() < 2)
			return 0;

		if (str.substring(0, 2).equals("hi"))
			return 1 + countHi2(str.substring(2));

		if (str.charAt(0) == 'x') {
			if (str.length() >= 3 && str.substring(1, 3).equals("hi"))
				return countHi2(str.substring(3));
		}

		return countHi2(str.substring(1));
	}
}
