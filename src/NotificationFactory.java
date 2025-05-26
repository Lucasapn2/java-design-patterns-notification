public class NotificationFactory {
    public static NotificationStrategy getStrategy(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SmsNotification();
            case "whatsapp":
                return new WhatsAppNotification();
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " + type);
        }
    }
}
