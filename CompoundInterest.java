/*
 * 
 */
package eu.jmantsolutions.businessmath;

// TODO: Auto-generated Javadoc
/**
 * Static Final class that computes values in
 * problems of Compound Interest.
 *
 * @author Ioannis A. Mantoudis
 * @version 1
 * @gmantds@gmail.com 
 */
public final class CompoundInterest 
{
		
	/**
	 * Computes Future Value - (FV) with Compound Interest.
	 *
	 * @param pv - Present Value - The present amount of money
	 * @param rate - Rate as a decimal number
	 * @param nper - Number of Time Periods as a decimal
	 * @return The Future Value in this investment
	 */
	public static double fv(double pv, double rate, double nper)
	{
		return (pv * Math.pow((1 + rate), nper)); 			
	}
	
	/**
	 * Computes Present Value - (PV) with compound Interest.
	 *
	 * @param fv - Future Value of Investment
	 * @param rate - Rate as a decimal number
	 * @param nper - Number of Time Periods as a decimal
	 * @return The Present Value of this investment
	 */
	public static double pv(double fv, double rate, double nper)
	{
		return (fv / Math.pow((1 + rate), nper));
	}
	
	/**
	 * Computes the Interest - (I) with Compound Interest.
	 *
	 * @param pv - Present Value of this investment
	 * @param rate - Rate as a decimal number
	 * @param nper - Number of Time Periods as a decimal
	 * @return The Interest of this Investment
	 */
	public static double interest(double pv, double rate, double nper)
	{
		return (pv * (Math.pow((1 + rate), nper) - 1));
	}
	
	/**
	 * Computes the Number of Periods in the investment given the other values.
	 *
	 * @param fv - Future Value of Investment
	 * @param pv - Present Value of this investment
	 * @param rate - Rate as a decimal number
	 * @return The Number of Time Periods as a decimal number
	 */
	public static double numberOfPeriods(double fv, double pv, double rate)
	{
		return ((Math.log10(fv / pv)) / (Math.log10(1 + rate)));
	}
	
	/**
	 * Computes the Rate of the investment given the other values.
	 *
	 * @param fv - Future Value of Investment
	 * @param pv - Present Value - The current amount of money in this investment
	 * @param nper - Number of Time Periods as a decimal
	 * @return The Rate of investment as a decimal number
	 */
	public static double rate(double fv, double pv, double nper)
	{
		return (Math.pow((fv / pv), (1 / nper)) - 1);
	}
}