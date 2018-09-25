package pkgCar;

public class BuyCar {
	public static double monthlyPayment(double interestRate, double loanLength, double downPayment, double carCost) {
		double r = ((interestRate/100) /12);
		double amountLeft = carCost - downPayment;
		double pay = (amountLeft * r) / (1 - Math.pow(1+r, -loanLength));
		return pay;
		}
		
	public static double totalInterest(double interestRate, double loanLength, double downPayment, double carCost) {
		double r = ((interestRate/100) /12);
		double amountLeft = carCost - downPayment; 
		double pay = (amountLeft * r) / (1 - Math.pow(1+r, -loanLength));
		return (pay * loanLength - amountLeft);
		}
}