package org.example.prototype.notificationExample;

import java.util.HashMap;
import java.util.Map;

public class NotificationRegistry {
    private static final Map<String, Notification> prototypes = new HashMap<>();

    public static void register(String key, Notification prototype) {
        prototypes.put(key, prototype);
    }

    public static Notification getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}
