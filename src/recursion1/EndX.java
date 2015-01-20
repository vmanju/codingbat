package recursion1;

/*
 * 
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string. 

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"

Expected	Run		
endX("xxre") → "rexx"	"rexx"	OK	    
endX("xxhixx") → "hixxxx"	"hixxxx"	OK	    
endX("xhixhix") → "hihixxx"	"hihixxx"	OK	    
endX("hiy") → "hiy"	"hiy"	OK	    
endX("h") → "h"	"h"	OK	    
endX("x") → "x"	"x"	OK	    
endX("xx") → "xx"	"xx"	OK	    
endX("") → ""	""	OK	    
endX("bxx") → "bxx"	"bxx"	OK	    
endX("bxax") → "baxx"	"baxx"	OK	    
endX("axaxax") → "aaaxxx"	"aaaxxx"	OK	    
endX("xxhxi") → "hixxx"	"hixxx"	OK
 */
public class EndX {
	public String endX(String str) {

		if (str.length() <= 1)
			return str;

		if (str.charAt(0) == 'x')
			return endX(str.substring(1)) + "x";

		return str.charAt(0) + endX(str.substring(1));
	}
}
