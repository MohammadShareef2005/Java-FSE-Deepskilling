public class Test{
    public static void main(String[] args) {

        // Basic Email Notification
        Notifier notifier1 = new EmailNotifier();
        System.out.println("== Basic Email ==");
        notifier1.send("Your order has been placed.");

        // Email + SMS Notification
        Notifier notifier2 = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println("\n== Email + SMS ==");
        notifier2.send("Your order has been shipped.");

        // Email + SMS + Slack Notification
        Notifier notifier3 = new SlackNotifierDecorator(
                                 new SMSNotifierDecorator(
                                     new EmailNotifier()));
        System.out.println("\n== Email + SMS + Slack ==");
        notifier3.send("Your order has been delivered.");
    }
}
