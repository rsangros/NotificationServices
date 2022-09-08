package com.manning.application.notification.NotificationPreferencesService.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationPreferencesRequest {
    private String customerId;

    @Override
    public String toString() {
        return "NotificationPreferencesRequest{" +
                "customerId='" + customerId + '\'' +
                '}';
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
