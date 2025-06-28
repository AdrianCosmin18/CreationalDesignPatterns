package org.example.prototype.notificationExample;

public class NotificationService {
    public static void main(String[] args) {
        // Configurăm prototipul standard de email
        EmailNotification emailTemplate = new EmailNotification(
                null,
                "Activare cont",
                "Contul tău a fost activat cu succes.",
                "HIGH"
        );

        NotificationRegistry.register("account-activation", emailTemplate);

        // Ulterior, clonezi și personalizezi
        EmailNotification emailToAlice = (EmailNotification) NotificationRegistry.getPrototype("account-activation");
        emailToAlice.setRecipient("alice@example.com");
        emailToAlice.setBody("Salut Alice! Contul tău e activ.");

        EmailNotification emailToBob = (EmailNotification) NotificationRegistry.getPrototype("account-activation");
        emailToBob.setRecipient("bob@example.com");

        emailToAlice.send();
        emailToBob.send();
    }
}
