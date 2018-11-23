package com.juvenxu.mvnbook.account.email;

/**
 * @ProjectName: Dome
 * @Package: com.juvenxu.mvnbook.account.email
 * @ClassName: AccountEmailService
 * @Description: java类作用描述
 * @Author: 吕小平
 * @CreateDate: 2018/11/23 10:07
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/23 10:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface AccountEmailService {

    /**
     * 发送邮件
     * @param to
     * @param subject
     * @param htmlText
     * @throws Exception
     */
    void sendMail(String to,String subject,String htmlText) throws Exception;
}
