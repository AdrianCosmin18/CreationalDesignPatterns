package org.example.prototype.notificationExample;

public class EmailNotification implements Notification {
    private String recipient;
    private String subject;
    private String body;
    private String priority;

    public EmailNotification(String recipient, String subject, String body, String priority) {
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        this.priority = priority;
    }

    @Override
    public EmailNotification clone() {
        return new EmailNotification(recipient, subject, body, priority);
    }

    @Override
    public void send() {
        System.out.println("Sending EMAIL to " + recipient +
                " | subject: " + subject +
                " | body: " + body +
                " | priority: " + priority);
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
