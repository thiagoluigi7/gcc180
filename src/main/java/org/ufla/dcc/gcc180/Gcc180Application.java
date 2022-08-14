package org.ufla.dcc.gcc180;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Gcc180Application {

	public static void main(String[] args) {
		SpringApplication.run(Gcc180Application.class, args);
	}

}
