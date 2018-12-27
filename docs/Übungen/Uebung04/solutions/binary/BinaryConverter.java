public class BinaryConverter {

	public String convert(int dNumber) {

	    // Positive or negative?
	    boolean positive = (dNumber >= 0);

	    String result;
	    
	    if (positive) {
			result = Integer.toBinaryString(dNumber);
		}
	    else{
	    	dNumber = 0 - dNumber;
	    	String onesComplement = Integer.toBinaryString(~dNumber);
	    	String twosComplement = "";
	    	boolean carry = true;
	    	for (int i = onesComplement.length() - 1; i >= 0; i--) {
	    		if (carry) {
	    			if (Character.getNumericValue(onesComplement.charAt(i)) == 0) {
	    				twosComplement = "1" + twosComplement;
	    				carry = false;
	    			}
	    			else{
	    				twosComplement = "0" + twosComplement;
	    			}
				}	
	    		else{
	    			twosComplement = onesComplement.charAt(i) + twosComplement;
	    		}
			}	    	
	    	result = twosComplement;	    	
	    }
	    return result;
	  }
}
