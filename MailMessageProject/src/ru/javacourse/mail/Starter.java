package ru.javacourse.mail;

public class Starter
{
    public static void main(String[] args) {
        MessageQueue mq = new MessageQueue();

        for(int i=0; i<5; i++) {
            MailMessage mm = new MailMessage();
            mm.setFrom("From_" + i);
            mm.setTo("To_" + i);
            mm.setSubject("Subject_" + i);
            mm.setBody("Body_" + i);
            mq.push(mm);
        }

        System.out.println(mq.size());

        MailMessage mail = mq.getMessage(0);
        System.out.println(mail.getSubject());

        while(mq.size()>0) {
            MailMessage mm = mq.pull();
            System.out.println(mm.getSubject());
        }
    }
}
