package recursion1;

/*
 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string. 

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2

countAbc("abc") → 1	1	OK	    
countAbc("abcxxabc") → 2	2	OK	    
countAbc("abaxxaba") → 2	2	OK	    
countAbc("ababc") → 2	2	OK	    
countAbc("abxbc") → 0	0	OK	    
countAbc("aaabc") → 1	1	OK	    
countAbc("hello") → 0	0	OK	    
countAbc("") → 0	0	OK	    
countAbc("ab") → 0	0	OK	    
countAbc("aba") → 1	1	OK	    
countAbc("aca") → 0	0	OK	    
countAbc("aaa") → 0	0	OK	 
 */
public class CountAbc {
	public int countAbc(String str) {
		if (str.length() < 3)
			return 0;

		if (str.substring(0, 2).equals("ab")) {
			if (str.charAt(2) == 'a') // because of overlap, eg: "ababc"
				return 1 + countAbc(str.substring(2));
			if (str.charAt(2) == 'c')
				return 1 + countAbc(str.substring(3));
		}

		return countAbc(str.substring(1));
	}
}
