package com.allsecure.notification_service_rbmq.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AttachmentFile implements Serializable {
    private String name;
    private byte[] data;
    private String contentType;
}
