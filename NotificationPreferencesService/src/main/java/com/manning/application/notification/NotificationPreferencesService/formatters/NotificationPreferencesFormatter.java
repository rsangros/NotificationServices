package com.manning.application.notification.NotificationPreferencesService.formatters;

import com.manning.application.notification.NotificationPreferencesService.entities.NotificationPreferences;
import com.manning.application.notification.NotificationPreferencesService.model.NotificationPreferencesResponse;

public class NotificationPreferencesFormatter {

    public static NotificationPreferencesResponse mapNotificationToNotificationPreferencesResponse(
            NotificationPreferences notificationPreferences) {

        NotificationPreferencesResponse notificationPreferencesResponse =
                new NotificationPreferencesResponse();

        notificationPreferencesResponse.setStatus(new String("SUCCESS"));
        notificationPreferencesResponse.setStatusDescription(new String("Notification Received Successfully"));
        notificationPreferencesResponse.setSmsPreferenceFlag(notificationPreferences.getSmsPreferenceFlag());
        notificationPreferencesResponse.setEmailPreferenceFlag(notificationPreferences.getEmailPreferenceFlag());
        notificationPreferencesResponse.setEmailAddress(notificationPreferences.getEmailAddress());
        notificationPreferencesResponse.setPhoneNumber(notificationPreferences.getPhoneNumber());

        return notificationPreferencesResponse;
    }
}
