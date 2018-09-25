package pkgCar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuyCarTest {
	
	@Test
	public void monthlyPaymentTest1() {
		double interestRate1 = 10.0;
		double loanLength1 = 60.0;
		double downPayment1 = 0.0;
		double carCost1 = 35000.0;
		double expected1 = 743.65;
		assertTrue (expected1 ==  Math.round((pkgCar.BuyCar.monthlyPayment(interestRate1, loanLength1, downPayment1, carCost1))*100) / 100d);
		}
	
	@Test
	public void monthlyPaymentTest2() {
		double interestRate2 = 12.0;
		double loanLength2 = 48.0;
		double downPayment2 = 4000.0;
		double carCost2 = 30000.0;
		double expected2 = 684.68;
		assertTrue (expected2 ==  Math.round((pkgCar.BuyCar.monthlyPayment(interestRate2, loanLength2, downPayment2, carCost2))*100) / 100d);
		}
	
	@Test
	public void totalInterestTest1() {
		double interestRate3 = 10.0;
		double loanLength3 = 60.0;
		double downPayment3 = 0.0;
		double carCost3 = 35000.0;
		double expected3 = 9618.79;
		assertTrue(expected3 == Math.round((pkgCar.BuyCar.totalInterest(interestRate3, loanLength3, downPayment3, carCost3))*100) / 100d);	
	}
	
	@Test
	public void totalInterestTest2() {
		double interestRate4 = 12.0;
		double loanLength4 = 48.0;
		double downPayment4 = 4000.0;
		double carCost4 = 30000.0;
		double expected4 = 6864.63;
		assertTrue (expected4 ==  Math.round((pkgCar.BuyCar.totalInterest(interestRate4, loanLength4, downPayment4, carCost4))*100) / 100d);
		}
}

