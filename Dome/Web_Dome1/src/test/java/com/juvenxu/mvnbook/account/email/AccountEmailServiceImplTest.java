package com.juvenxu.mvnbook.account.email;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.GreenMailUtil;
import com.icegreen.greenmail.util.ServerSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.mail.Message;

import static org.junit.Assert.*;

/**
 * @ProjectName: Dome
 * @Package: com.juvenxu.mvnbook.account.email
 * @ClassName: AccountEmailServiceImplTest
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 2018/11/23 15:28
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/23 15:28
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class AccountEmailServiceImplTest {

    private GreenMail greenMail;

    @Before
    public void start() {
        greenMail = new GreenMail(ServerSetup.SMTP);
        greenMail.setUser("test@juvenxu.com","123456");
        greenMail.start();
    }

    @Test
    public void sendMail() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("account-email.xml");
        AccountEmailService accountEmailService = (AccountEmailService)ctx.getBean("accountEmailService");
        String subject = "test";
        String htmlText = "<h3>test</h3>";

        accountEmailService.sendMail("test@juvenxu.com",subject,htmlText);
        greenMail.waitForIncomingEmail(2000,1);
        Message[] msgs=greenMail.getReceivedMessages();
        assertEquals(1,msgs.length);
        assertEquals(subject,msgs[0].getSubject());
        assertEquals(htmlText, GreenMailUtil.getBody(msgs[0]).trim());
    }

    @After
    public void stop(){
        greenMail.stop();
    }
}