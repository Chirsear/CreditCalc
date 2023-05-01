public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000; // сумма займа
        double percent = 9.99; // годовая ставкв
        double fraction = percent / 12 / 100; // месячная ставка по займу в долях от единицы
        int a = 1; // на 1 год
        a = 12;
        int b = 2; // на 2 года
        b = 24;
        int c = 3; // на 3 года
        c = 36;
        int paymentone = service.calculate(amount, fraction, a);
        int paymenttwo = service.calculate(amount, fraction, b);
        int paymentthree = service.calculate(amount, fraction, c);
        System.out.println("Ежемесячный платеж на срок 1 год " + paymentone + " руб.");
        System.out.println("Ежемесячный платеж на срок 2 года " + paymenttwo + " руб.");
        System.out.println("Ежемесячный платеж на срок 3 года " + paymentthree + " руб.");

    }
}
