package com.epam.telegram.service;

import com.epam.telegram.entity.Notification;
import com.epam.telegram.exception.NotificationException;
import com.epam.telegram.service.impl.TelegramNotificationSenderService;
import org.testng.annotations.Test;

public class TelegramNotificationSenderServiceTest {

    Notification notification = new Notification.Builder()
            .setNotificationId(1)
            .setName("Курс по зельеварению")
            .setAuthor("Северус Снейп")
            .setComplexity(4)
            .setAllowableAttempts(3)
            .setDescription("Крутой курс, чего вы")
            .build();

    @Test
    public void testSendMessage() throws NotificationException {
        NotificationSenderService service = new TelegramNotificationSenderService();
        service.sendMessage(notification);
    }
}
