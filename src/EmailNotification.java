public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando E-MAIL: " + message);
    }
}
