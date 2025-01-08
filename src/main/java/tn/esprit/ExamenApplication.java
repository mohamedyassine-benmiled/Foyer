package tn.esprit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EntityScan(basePackages = "tn.esprit.entities")
public class ExamenApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExamenApplication.class, args);
	}

}
