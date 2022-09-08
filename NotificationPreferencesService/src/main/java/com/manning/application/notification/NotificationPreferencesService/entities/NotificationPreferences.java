package com.manning.application.notification.NotificationPreferencesService.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "notification_preferences")
public class NotificationPreferences {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 250)
    @Column(name="customer_id")
    private String customerId;

    @Column(name="sms_preference_flag")
    private Boolean smsPreferenceFlag;

    @Column(name="email_preference_flag")
    private Boolean emailPreferenceFlag;

    @NotNull
    @Size(max = 250)
    @Column(name="phone_number")
    private String phoneNumber;

    @NotNull
    @Size(max = 250)
    @Column(name="email_address")
    private String emailAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Boolean getSmsPreferenceFlag() {
        return smsPreferenceFlag;
    }

    public void setSmsPreferenceFlag(Boolean smsPreferenceFlag) {
        this.smsPreferenceFlag = smsPreferenceFlag;
    }

    public Boolean getEmailPreferenceFlag() {
        return emailPreferenceFlag;
    }

    public void setEmailPreferenceFlag(Boolean emailPreferenceFlag) {
        this.emailPreferenceFlag = emailPreferenceFlag;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
