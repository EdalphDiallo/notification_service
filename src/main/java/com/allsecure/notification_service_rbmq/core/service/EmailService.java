package com.allsecure.notification_service_rbmq.core.service;

/**
 * @author RICHTHUG
 * @version 3.0
 * @license STREET GHOSTS
 * @since 24/07/2023
 */

public interface EmailService {
    void sendSimpleMailMessage(String name, String to, String token);
    void sendMimeMessageWithAttachments(String name, String to, String token);
    void sendMimeMessageWithEmbeddedFiles(String name, String to, String token);
    void sendHtmlEmail(String name, String to, String token);
    void sendHtmlEmailWithEmbeddedFiles(String name, String to, String token);
}
