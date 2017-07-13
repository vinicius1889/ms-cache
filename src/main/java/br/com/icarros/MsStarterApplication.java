package br.com.icarros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class MsStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsStarterApplication.class, args);
	}
}
