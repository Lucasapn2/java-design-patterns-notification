public class Main {
    public static void main(String[] args) {
        NotificationService service = NotificationService.getInstance();

        NotificationStrategy email = NotificationFactory.getStrategy("email");
        NotificationStrategy sms = NotificationFactory.getStrategy("sms");
        NotificationStrategy whatsapp = NotificationFactory.getStrategy("whatsapp");

        service.sendNotification(email, "Olá, bem-vindo ao nosso sistema!");
        service.sendNotification(sms, "Você tem um novo código de verificação.");
        service.sendNotification(whatsapp, "Seu pedido foi entregue com sucesso!");
    }
}
