package mail;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import model.EmailCmd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.micronaut.http.HttpResponse;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller("/mail")
public class MailController {
    private static final Logger logger = LoggerFactory.getLogger(MailController.class);


    @Post("/send")
    public HttpResponse send() {
        logger.info("**********Hiiiii Mailing Services With SES ....haaaaaahahah");
        EmailService emailService = new EmailServiceImpl();
        System.out.println("*************Sending Mail Triggerrrr************");
        try {
            List<String> ccList = new ArrayList<String>();
            List<String> ffList = new ArrayList<String>();
            Email email = new EmailCmd("sonumiet068@gmail.com", "Regarding Demo", "", "Welcome to Send Mail Via SES", "", ccList, ffList);
            emailService.send(email);
            return HttpResponse.ok();
        } catch (Exception ex) {
            logger.info("Error During send message");
            System.out.println(ex);
            return HttpResponse.badRequest();
        }
    }


}
