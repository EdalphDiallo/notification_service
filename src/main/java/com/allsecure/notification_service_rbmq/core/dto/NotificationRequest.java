package com.allsecure.notification_service_rbmq.core.dto;

import com.allsecure.notification_service_rbmq.enums.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationRequest<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    // Enumération représentant les différents types de notifications
    private NotificationType type;

    // Sujet de la notification
    private String subject;

    // Contenu de la notification
    private T content;

    // Nom du modèle utilisé pour la génération de la notification
    private String templateName;

    // Destinataires principaux de la notification
    private String[] to;

    // Destinataires en copie conforme (cc) de la notification
    private String[] cc;

    // Autres destinataires de la notification
    private String[] bcc;

    // Message texte de la notification
    private String message;

    // Liste des pièces jointes à la notification
    private Set<AttachmentFile> attachmentFiles = new HashSet<>();
}
