package eu.jmantsolutions.businessmath;

public class MainTestCompoundInterest 
{

	public static void main(String[] args) 
	{
		/* Testing fv method for finding Future Value with the numbers:
		 * PV = 450000, rate = 0,05, nper = 4
		 */
		double fValue;
		fValue = CompoundInterest.fv(450000, 0.05, 4);
		System.out.printf("FV = %,.2f€\n", fValue);
		
		/* Testing pv method for finding Present Value with the numbers:
		 * FV = 424000, rate = 0,04, nper = 8
		 */
		double pValue;
		pValue = CompoundInterest.pv(424000, 0.04, 8);
		System.out.printf("PV = %,.2f€\n", pValue);
		
		/* Testing interest method for finding the Interest with the numbers
		 * PV = 450000, rate = 0,05, nper = 4
		 */
		double interest;
		interest = CompoundInterest.interest(450000, 0.05, 4);
		System.out.printf("I = %,.2f€\n",  interest);
		
		/* Testing numberOfPeriods method with the numbers
		 * FV = 590982, rate = 0, 05, PV = 400000
		 */
		double nOfPeriods;
		nOfPeriods = CompoundInterest.numberOfPeriods(590982, 400000, 0.05);
		System.out.printf("nPer = %,.4f\n",  nOfPeriods);
		
		/* Testing rate method with numbers
		 * PV = 350000, FV = 555406, nPer =6
		 */
		double rate;
		rate = CompoundInterest.rate(555406, 350000, 6);
		System.out.printf("Rate = %,.2f\n",  rate);

	}

}
