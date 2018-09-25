package pkgCar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuyCarTest {
	
	@Test
	public void monthlyPaymentTest1() {
			double interestRate1 = 10.0;
			double loanLength1 = 60.0;
			double downPayment1 = 35000.0;
			double expected1 = 743.65;

			assertEquals(expected1, pkgCar.BuyCar.monthlyPayment(interestRate1, loanLength1, downPayment1));
			}
	@Test
	public void totalInterestTest1() {
		double interestRate1 = 10.0;
		double loanLength1 = 60.0;
		double downPayment1 = 35000.0;
		double expected2 = 9618.79;
		
		assertEquals(expected2, pkgCar.BuyCar.totalInterest(interestRate1, loanLength1, downPayment1));
		
	}

}
