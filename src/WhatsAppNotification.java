public class WhatsAppNotification implements NotificationStrategy {
    @Override
    public void send(String message) {
        System.out.println("Enviando WhatsApp: " + message);
    }
}
