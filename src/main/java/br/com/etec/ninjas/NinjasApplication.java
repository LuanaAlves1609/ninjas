package br.com.etec.ninjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjasApplication.class, args);
	}
// para executar no terminal coloque: mvn spring-boot:run

// quando adicionar uma dependencia no pom.xml, precisa executar no terminal o comando de atualização do maven para ser 
//reconhecida no projeto: mvn clean install -U
}

