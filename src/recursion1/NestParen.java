package recursion1;

/*
 * Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them. 

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false

nestParen("(())") → true	true	OK	    
nestParen("((()))") → true	true	OK	    
nestParen("(((x))") → false	false	OK	    
nestParen("((())") → false	false	OK	    
nestParen("((()()") → false	false	OK	    
nestParen("()") → true	true	OK	    
nestParen("") → true	true	OK	    
nestParen("(yy)") → false	false	OK	    
nestParen("(())") → true	true	OK	    
nestParen("(((y))") → false	false	OK	    
nestParen("((y)))") → false	false	OK	    
nestParen("((()))") → true	true	OK	    
nestParen("(())))") → false	false	OK	    
nestParen("((yy())))") → false	false	OK	    
nestParen("(((())))") → true	true	OK
 */
public class NestParen {

	public boolean nestParen(String str) {

		int len = str.length();
		if (len <= 0)
			return true;

		if (str.charAt(0) == '(' && str.charAt(len - 1) == ')')
			return nestParen(str.substring(1, len - 1));

		return false;
	}
}
