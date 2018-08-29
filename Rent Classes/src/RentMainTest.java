/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmath.api;

/**
 *
 * @author Administrator
 */
public class RentMainTest 
{

    public static void main(String[] args) 
    {
        /* Testing fv method for computing Future Value of Annuities with the numbers:
	* PMT = 86700, rate = 0,0542, nper = 8, type = 0 (Ordinary Annuity)
	 */
	double fValue;
	fValue = Rent.fv(86700, 0.0542, 8, 0);
	System.out.printf("Ordinary Annuity: FV = %,.2f€\n", fValue);			
		
	/* Testing fv method for computing Future Value of Annuities with the numbers:
	 * PMT = 40000, rate = 0,06, nper = 15, type = 1 (Annuity Due)
	 */
	fValue = Rent.fv(40000, 0.06, 15, 1);
	System.out.printf("Annuity Due: FV = %,.2f€\n", fValue);
		
	/* Testing pv method for computing Present Value of Annuities with the numbers:
	 * PMT = 24000, rate = 0,075, nper = 15, type = 0 (Ordinary Annuity)
	 */
	double pValue;
	pValue = Rent.pv(24000, 0.075, 15, 0);
	System.out.printf("Ordinary Annuity: PV = %,.2f€\n", pValue);
		
	/* Testing pv method for computing Present Value of Annuities with the numbers:
	 * PMT = 35000, rate = 0,04, nper = 18, type = 1 (Annuity Due )
	 */
	pValue = Rent.pv(35000, 0.04, 18, 1);
	System.out.printf("Annuity Due: PV = %,.2f€\n", pValue);
		
	/* Testing numberOfPeriods method for computing the number of periods of Annuities with the numbers:
	 * PMT = 50000, rate = 0,06, PV = 484000, type = 0 (Ordinary Annuity)
	 */
	double nper;
	nper = Rent.numberOfPeriods(50000, 484000, 0.06, 0);
        System.out.printf("Ordinary Annuity: numberOfPeriods = %,.4f\n", Math.abs(nper));
        
        /* Testing numberOfPeriods method for computing the number of periods of Annuities with the numbers:
	 * PMT = 60000, rate = 0,045, PV = 560000, type = 1 (Annuity Due)
	 */
	nper = Rent.numberOfPeriods(60000, 560000, 0.045, 1);
        System.out.printf("Annuity Due: numberOfPeriods = %,.4f\n", Math.abs(nper));
        
        /* Testing pmt method for computing the Payment of Annuities with the numbers:
	 * PV = 1800000, nper = 15, rate = 0,04, type = 0 (Ordinary Annuity)
	 */
	double payment;
	payment = Rent.pmt(1800000, 15, 0.04, 0);
        System.out.printf("Ordinary Annuity: PMT = %,.2f€\n", payment);
        
        /* Testing pmt method for computing the Payment of Annuities with the numbers:
	 * PV = 1000000, nper = 15, rate = 0,04, type = 1 (Annuity Due)
	 */
	payment = Rent.pmt(1000000, 15, 0.04, 1);
        System.out.printf("Annuity Due: PMT = %,.2f€\n", payment);
    }
    
}
