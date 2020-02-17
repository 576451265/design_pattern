package com.lh.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-30 10:52
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学,邮件地址值:{1},邮件内容:{2}发送成功";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }
    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录，originMail："+mail.getContent());
    }

}
