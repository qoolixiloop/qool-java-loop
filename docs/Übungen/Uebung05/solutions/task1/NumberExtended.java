public class Number {
	...
	
	public boolean isSmallerThanOrEquals(Number other) {
		return isSmallerThan(other) || equals(other);
	}
	
	public boolean isLargerThan(Number other) {
		return !isSmallerThan(other) && !equals(other);
	}
	
	public boolean isLargerThanOrEquals(Number other) {
		return isLargerThan(other) || equals(other);
	}
	
}
