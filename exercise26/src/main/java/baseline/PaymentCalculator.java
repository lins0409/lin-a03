package baseline;
import baseline.Solution26;

class PaymentCalculator{

    public double balance, APR, payment;
    //constructor to store all the values
    public PaymentCalculator(double balance, double APR, double payment){
        this.balance = balance;
        this.APR = APR;
        this.payment = payment;
    }
    //does not take in parameters (APR, balance, and payment amount)
    public int calculateMonthsUntilPaidOff(){
        double APR = this.APR;
        double balance = this.balance;
        double payment = this.payment;
        //create an int n for the result
        int n;

        //divide APR by 365 and set to int i
        APR = APR / 365;
        //calculate -(1/30) * log(1 + balance/payment * (1 - (1 + i)^30)) / log(1 + i)
        n = (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + APR, 30))) / Math.log(1 + APR));
        return n;
    }
}
