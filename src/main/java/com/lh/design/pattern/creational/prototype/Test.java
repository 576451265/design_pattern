package com.lh.design.pattern.creational.prototype;

/**
 * @Description 原型模式测试类
 * @Author LuoH
 * @Date 2020-01-30 10:58
 */
public class Test {
    /*
    旧方式 大量创建不好
     */
    /*
    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        MailUtil.saveOriginMailRecord(mail);
        for (int i = 0; i < 10; i++) {
//            Mail mail = new Mail();
            mail.setName("姓名"+i);
            mail.setEmailAddress("姓名"+i+"@qq.com");
            mail.setContent("恭喜您中奖了");
            MailUtil.sendMail(mail);
        }
//        MailUtil.saveOriginMailRecord(mail);
    }
    */

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@qq.com");
            mailTemp.setContent("恭喜您中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("初始化mail:"+mail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
