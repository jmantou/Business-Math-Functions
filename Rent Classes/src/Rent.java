package businessmath.api;

/**
 * Static Final class that computes values in
 * problems of Rents (Annuities) and Money Series
 *
 * @author Ioannis A. Mantoudis
 * @version 1
 * @gmantds@gmail.com 
 */
public final class Rent 
{
    /**
     * Computes Future Value - (FV) of a Rent (Annuity) that is
     * either Ordinary or Annuity Due. The annuity does not have an initial deposit.
	 
     * @param pmt - Payment, The amount of money in each time period
     * @param rate - Rate of the Rent as a decimal number
     * @param nper - Number of Time Periods as a decimal
     * @param type - Defines if the rent is Ordinary (0) or Annuity Due (1)
     * @return fv - The Future Value of the rent
     */
    public static double fv(double pmt, double rate, double nper, int type)
    {
	if (type == 0)
            return ((pmt) * ((Math.pow((1 + rate), nper)) - 1) / (rate));
        else if (type == 1)
            return ((1 + rate) * ((pmt) * ((Math.pow((1 + rate), nper)) - 1) / (rate)));
        else
            return -1;
    }
	
    /**
     * Computes Present Value - (PV) of a Rent (Annuity) that is
     * either Ordinary or Annuity Due. The annuity does not have an initial deposit.
     *
     * @param pmt - Payment, the amount of money in each time period
     * @param rate - Rate of the rent as a decimal number
     * @param nper - Number of Time Periods as a decimal
     * @param type - Defines if the rent is Ordinary (0) or Due (1)
     * @return pv - The Present Value of this rent
     */
    public static double pv(double pmt, double rate, double nper, int type)
    {
	if (type == 0)
            return ((pmt) * ((1 - (1 / (Math.pow((1 + rate), nper)))) / (rate)));
        else if (type == 1)
            return ((pmt) * ((1 - (1 / (Math.pow((1 + rate), nper)))) / (rate)) * (1 + rate));
        else
            return -1;
    }
	
    /**
     * Computes the Number of Periods (nper) of the Rent (Annuity) given the Pmt, Pv and Rate arguments.
     *
     * @param pv - Present Value of this investment
     * @param pmt - Payment, the amount of money in each time period
     * @param rate - Rate as a decimal number
     * @param type - Defines if the rent is Ordinary (0) or Due (1)
     * @return numberOfPeriods - The Number of Time Periods (nper) as a decimal number
     */
    public static double numberOfPeriods(double pmt, double pv, double rate, int type)
    {
	if (type == 0)
            return ((Math.log10(1 - (pv * rate) / (pmt))) / (Math.log10(1 + rate)));
        else if (type == 1)
            return ((Math.log10(1 - (pv * rate) / ((1 + rate) * (pmt)))) / (Math.log10(1 + rate)));
        else
            return -1;
    }
	 
    /**
     * Computes the Payment (PMT) of the rent for paying back the initial deposit Pv given also the rate and nper arguments.
     *
     * @param pv - Present Value - The current amount of money in this investment, typically a loan
     * @param rate - Rate of investment or loan as a decimal number
     * @param type - Defines if the rent is Ordinary (0) or Due (1)
     * @param nper - Number of Time Periods as a decimal
     * @return pmt - The payment for each time period
     * 
     */
    public static double pmt(double pv, double nper, double rate, int type)
    {
	if (type == 0)
            return ((pv * rate) / (1 - (1) / (Math.pow((1 + rate), nper))));
        else if (type == 1)
            return ((pv * rate) / ((1 - (1) / (Math.pow((1 + rate), nper))) * (1 + rate)));
        else 
            return -1;
    }
}
