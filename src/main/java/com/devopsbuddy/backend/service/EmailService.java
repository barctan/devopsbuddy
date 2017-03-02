package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * Created by Artan on 02/03/2017.
 */
@Service
public interface EmailService {

    /**
     * Send an email with the content in the Feedback Pojo
     * @param feedbackPojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Sends an email with the content of the Simple Mail Message object.
     * @param message
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);

}
