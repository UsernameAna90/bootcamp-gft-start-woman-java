package com.spring.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// Context do Spring Framework
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

		// Utiliza o bean para instanciar o objeto
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Coraline");
		livro.setCodigo(0153);

		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Neil Gaiman");
		livro.exibir();
	}

}
