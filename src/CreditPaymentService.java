public class CreditPaymentService {

    public int calculate(int amount, double fraction, int a) {
        double calc = amount * fraction * Math.pow((1 + fraction), a) / (Math.pow((1 + fraction), a) - 1);
        int result = (int) calc;
        return result;
    }
}
