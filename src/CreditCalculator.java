public class CreditCalculator {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int months = 12;
        int creditSum = 1_000_000;
        double rate = 9.99;
        double monthlyRate = rate / 1200;
        double monthPayment = service.calculate(months, creditSum, monthlyRate, rate);
        System.out.println("Срок кредита 1 год");
        System.out.println(monthPayment);

        System.out.println();
        System.out.println("Срок кредита 2 года");
        System.out.println(service.calculate(24, creditSum, monthlyRate,rate));;

        System.out.println();
        System.out.println("Срок кредита 3 года");
        System.out.println(service.calculate(36, creditSum, monthlyRate,rate));;

    }
}
