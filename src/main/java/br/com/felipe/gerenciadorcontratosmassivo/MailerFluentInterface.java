package br.com.felipe.gerenciadorcontratosmassivo;

import java.util.function.Consumer;

public class MailerFluentInterface {
    private MailerFluentInterface() {
    }

    public MailerFluentInterface from(String addr){
        System.out.println("from");
        return this;
    }

    public MailerFluentInterface to(String addr){
        System.out.println("from");
        return this;
    }

    public MailerFluentInterface subject(String line){
        System.out.println("subject");
        return this;
    }

    public MailerFluentInterface body(String text){
        System.out.println("body");
        return this;
    }

    public static  void send(Consumer<MailerFluentInterface> sender){
        MailerFluentInterface mailer = new MailerFluentInterface();
        sender.accept(mailer);
        System.out.println("...sending...");
    }
}
