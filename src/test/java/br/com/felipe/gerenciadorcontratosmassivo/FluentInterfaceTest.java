package br.com.felipe.gerenciadorcontratosmassivo;

import org.junit.jupiter.api.Test;

import static br.com.felipe.gerenciadorcontratosmassivo.MailerFluentInterface.*;

public class FluentInterfaceTest {
    @Test
    void should_send_email_using_fluent_interface(){
        send(mailer ->
           mailer.from("teste@teste.gmail.com")
             .to("jjj@gmail.com")
             .subject("code...")
             .body("...details...")
        );
    }
}
