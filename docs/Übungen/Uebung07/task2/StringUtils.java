package task2;

public class StringUtils {
	/**
	* <p>Returns padding using the specified delimiter repeated
	* to a given length.</p>
	*
	* <pre>
	* StringUtils.repeat('e', 0)  = ""
	* StringUtils.repeat('e', 3)  = "eee"
	* StringUtils.repeat('e', -2) = ""
	* </pre>
	*
	*
	* @param ch  character to repeat
	* @param times  number of times to repeat char, negative treated as zero
	* @return String with repeated character
	*/
	public static String repeat(char ch, int times) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < times; i++) {
		    sb.append(ch);
		}
		return sb.toString();
	}
}
