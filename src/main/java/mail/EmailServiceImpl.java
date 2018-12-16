package mail;

import AwsCredential.AwsCredentailService;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.*;
import model.EmailCmd;

public class EmailServiceImpl implements EmailService {

    @Override
    public void send(Email email) {
        System.out.println(email.getRecipient());
        System.out.println(email.getSource());
        System.out.println(email.getSubject());
        System.out.println(email.getTextBody());
        try {
            AWSCredentialsProvider awsCredentailService = new AwsCredentailService();
            String awsRegion = "us-east-1";
            Content content = new Content(email.getSubject());
            Body body = new Body();
            Content contentOfTextBody = new Content(email.getTextBody());
            body.setText(contentOfTextBody);
            Message message = new Message().withSubject(content).withBody(body);
            message.setSubject(content);
            message.setBody(body);
            Destination destination = new Destination().withToAddresses(email.getRecipient());
            SendEmailRequest sendEmailRequest = new SendEmailRequest().withDestination(destination).withSource(email.getSource()).withMessage(message);
            AmazonSimpleEmailService client = AmazonSimpleEmailServiceClientBuilder.standard().withCredentials(awsCredentailService).withRegion(awsRegion).build();
            client.sendEmail(sendEmailRequest);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
