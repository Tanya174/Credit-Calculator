public class CreditPaymentService {
    public double calculate(int months, int creditSum, double monthlyRate, double rate) {
        double monthPayment;
        monthPayment = creditSum * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
        return (int) monthPayment;
    }
}

