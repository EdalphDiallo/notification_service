package com.allsecure.notification_service_rbmq.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum NotificationType {

    EMAIL("EMAIL"),
    SMS("SMS"),
    OTHER("OTHER");

    private final String type;

}
