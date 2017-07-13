package br.com.icarros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class IntegradoricarrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegradoricarrosApplication.class, args);
	}
}
