package br.com.icarros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableJms
@EnableScheduling
@SpringBootApplication
public class MsStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsStarterApplication.class, args);
	}
}
