package dio.springboot.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
	@Value("${name:NoReply-DIO}") //Referencia a variavel declarada no properties, o ':' serve para utilizar como valor padrão caso não encontre a variavel.
	private String nome;
	@Value("${email}") //Referencia a variavel declarada no properties
	private String email;
	@Value("${telefones}") //Referencia a variavel declarada no properties
	private List<Long> telefones =
			new ArrayList<>(Arrays.asList(new Long[]{11956781254L}));

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + nome
				+ "\nE-mail:" + email
				+ "\nCom telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
	}
}
