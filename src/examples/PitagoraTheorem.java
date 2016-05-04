package examples;

public class PitagoraTheorem {

	public PitagoraTheorem() {
	
	}
	
	@Deprecated
	public boolean validatePitagoraTh(double a, double b, double c){
		return a*a == b*b + c*c;
	}
	
	@Deprecated
	public double calculateA(double b, double c){
		return Math.sqrt(b*b+c*c);
	}
	
	public void validateNumbersWithException(double a, double b, double c){
		if (a*a != b*b + c*c) {
			throw new IllegalArgumentException("Not Pitagoream numbers.");
		}
	}

}
