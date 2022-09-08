package com.manning.application.notification.NotificationPreferencesService.repositories;

import com.manning.application.notification.NotificationPreferencesService.entities.NotificationPreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface NotificationPreferencesRepository extends JpaRepository<NotificationPreferences, String> {
    Optional<NotificationPreferences> findByCustomerId(String customerId);


}
