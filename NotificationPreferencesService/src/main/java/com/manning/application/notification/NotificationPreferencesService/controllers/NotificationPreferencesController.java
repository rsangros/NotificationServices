package com.manning.application.notification.NotificationPreferencesService.controllers;

import com.manning.application.notification.NotificationPreferencesService.model.NotificationPreferencesRequest;
import com.manning.application.notification.NotificationPreferencesService.model.NotificationPreferencesResponse;
import com.manning.application.notification.NotificationPreferencesService.repositories.NotificationPreferencesRepository;
import com.manning.application.notification.NotificationPreferencesService.services.NotificationPreferencesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/notification/preferences")
public class NotificationPreferencesController {
    @Autowired
    private NotificationPreferencesRepository notificationPreferencesRepository;

    @Autowired
    private NotificationPreferencesService notificationPreferencesService;

    private static final Logger logger = LoggerFactory.getLogger(NotificationPreferencesController.class);

    @GetMapping
    public NotificationPreferencesResponse getNotificationPreferencesByCustomerId(
            @Valid @RequestBody NotificationPreferencesRequest notificationPreferencesRequest) {
        return notificationPreferencesService.getNotificationPreferences(notificationPreferencesRequest);
    }
}
