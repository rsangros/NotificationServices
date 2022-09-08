package com.manning.application.notification.NotificationPreferencesService.services;

import com.manning.application.notification.NotificationPreferencesService.entities.NotificationPreferences;
import com.manning.application.notification.NotificationPreferencesService.exception.ResourceNotFoundException;
import com.manning.application.notification.NotificationPreferencesService.formatters.NotificationPreferencesFormatter;
import com.manning.application.notification.NotificationPreferencesService.model.NotificationPreferencesRequest;
import com.manning.application.notification.NotificationPreferencesService.model.NotificationPreferencesResponse;
import com.manning.application.notification.NotificationPreferencesService.repositories.NotificationPreferencesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NotificationPreferencesService {
    @Autowired
    private NotificationPreferencesRepository notificationPreferencesRepository;

    private final static Logger logger = LoggerFactory.getLogger(NotificationPreferencesService.class);

    public NotificationPreferencesResponse getNotificationPreferences(NotificationPreferencesRequest notificationPreferencesRequest) {
        NotificationPreferences notificationPreferences =
                notificationPreferencesRepository.findByCustomerId(notificationPreferencesRequest.getCustomerId()).orElseThrow(
                        () -> new ResourceNotFoundException("NotificationPreferences", "customerId", notificationPreferencesRequest.getCustomerId()));

        return NotificationPreferencesFormatter
                .mapNotificationToNotificationPreferencesResponse(notificationPreferences);
    }
}
