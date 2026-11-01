package recursion;

public class RecursionProblems {
	
	public static int strCount(String str, String sub) {
		
		//base case
		if( str.length()< sub.length())
			return 0;
		
		//int numLetters = sub.length();
		String substr = str.substring(0, sub.length());
		if(substr.equals(sub)) {
			return 1 + strCount(str.substring(sub.length()), sub);
		}
		//did not find the sub word
		//take out first letter in str
		return strCount(str.substring(1), sub);
	}

	public static int count8(int n) {
		
		//base case
 		if(n==0) {
			return 0;
		}
		
		//get the ones place and see if it an 8
		int onesPlace = n % 10;
		//get rid of that ones place
		n /= 10;
		if (onesPlace == 8) {
			int tensPlace = n % 10;
			if(tensPlace == 8)
				return 2 + count8(n); //means we have 88
			else
				return 1 + count8(n); //means we have x8
			}//end if
		return count8(n); //means we have 
	}
	
	public static void main (String[] args) {
		System.out.println(count8(88188));
		System.out.println(strCount("catcowccat", "cat"));
	}
}
