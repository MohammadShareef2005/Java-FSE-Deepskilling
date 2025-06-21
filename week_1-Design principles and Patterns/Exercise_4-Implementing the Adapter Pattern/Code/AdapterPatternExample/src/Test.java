public class Test{
    public static void main(String[] args) {
        // Using PayPal through adapter
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        payPalProcessor.processPayment(2500);

        // Using Stripe through adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(4500);
    }
}
