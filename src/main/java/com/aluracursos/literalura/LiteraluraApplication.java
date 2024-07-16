package com.aluracursos.literalura;


import com.aluracursos.literalura.service.APIconsumo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//implements CommandLineRunnner
//Permite definir código que se ejecutará automáticamente cuando se inicie la aplicación.
@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);

	}
//Metodo para el CommandLine
	@Override
	public void run(String... args) throws Exception {
		var API_URL = "https://gutendex.com/books";
		APIconsumo apiConsumo = new APIconsumo();

		apiConsumo.consumirAPI(API_URL);

		System.out.println(apiConsumo);



	}


}