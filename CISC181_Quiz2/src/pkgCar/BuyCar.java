package pkgCar;

public class BuyCar {
	public static double monthlyPayment(double interestRate, double loanLength, double downPayment) {
		double a = (1 + (interestRate/12));
		double b = Math.pow(a, loanLength);
		double pay = downPayment * ((interestRate/12) * b) / (b - 1);
		return pay;
		}
		
	public static double totalInterest(double interestRate, double loanLength, double downPayment) {
		double i = interestRate / loanLength;
		return i * downPayment;
		}
}
