package br.com.hugomachadodev.BackendGerenciaDeConfiguracao;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendGerenciaDeConfiguracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendGerenciaDeConfiguracaoApplication.class, args);

		System.out.println("==> Servidor Rodando!");
		
		Scanner scan = new Scanner(System.in); 

		while (true) {
			System.out.printf("\n--> Digite um Nome: ");
			String name = scan.nextLine();
			System.out.println("==> Nome Digitado: " + name);
		}
	}

}
