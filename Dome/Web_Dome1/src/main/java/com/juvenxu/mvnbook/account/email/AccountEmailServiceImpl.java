package com.juvenxu.mvnbook.account.email;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @ProjectName: Dome
 * @Package: com.juvenxu.mvnbook.account.email
 * @ClassName: AccountEmailServiceImpl
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 2018/11/23 14:17
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/23 14:17
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class AccountEmailServiceImpl implements AccountEmailService {

    private JavaMailSender javaMailSender;
    private String systemEmail;

    public void sendMail(String to, String subject, String htmlText) {
        try {
            MimeMessage msg = javaMailSender.createMimeMessage();
            MimeMessageHelper msgHelper = new MimeMessageHelper(msg);

            msgHelper.setFrom(systemEmail);
            msgHelper.setTo(to);
            msgHelper.setSubject(subject);
            msgHelper.setText(htmlText,true);

            javaMailSender.send(msg);
        }catch (MessagingException e){
            throw new RuntimeException("faild to send mail."+e);
        }
    }

    public JavaMailSender getJavaMailSender() {
        return javaMailSender;
    }

    public void setJavaMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String getSystemEmail() {
        return systemEmail;
    }

    public void setSystemEmail(String systemEmail) {
        this.systemEmail = systemEmail;
    }
}
