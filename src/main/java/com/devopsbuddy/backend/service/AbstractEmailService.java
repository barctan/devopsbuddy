package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Artan on 02/03/2017.
 */
public abstract class AbstractEmailService implements EmailService {

    @Value("${default.to.address}")
    private String defaultToAddress;

    /**
     * Creates a Simple Mail Message from a Feedback Pojo
     * @param feedback The Feedback Pojo
     * @return
     */
    protected SimpleMailMessage prepareSimpleMailMEssageFromFeedbackPojo(FeedbackPojo feedback){
        SimpleMailMessage message= new SimpleMailMessage();
        message.setTo(defaultToAddress);
        message.setFrom(feedback.getEmail());
        message.setSubject("[DevOps Buddy]!: Feedback received from "+feedback.getFirstName()
        +" "+feedback.getLastName()+"!");
        message.setText(feedback.getFeedback());
        return message;
    }

    @Override
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo) {
        sendGenericEmailMessage(prepareSimpleMailMEssageFromFeedbackPojo(feedbackPojo));
    }
}
