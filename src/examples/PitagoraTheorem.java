package examples;

public class PitagoraTheorem {

	public PitagoraTheorem() {
	
	}
	
	public boolean validatePitagoraTh(double a, double b, double c){
		return a*a == b*b + c*c;
	}
	
	public double calculateA(double b, double c){
		return Math.sqrt(b*b+c*c);
	}

}
