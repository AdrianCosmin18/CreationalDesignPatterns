package org.example.prototype.notificationExample;

public interface Notification extends Cloneable {
    Notification clone();
    void send();
}
