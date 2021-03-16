package com.tlc.t11;

import com.tlc.t11.Controllers.IndexController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ExchangeConnectivityApplication {

	IndexController indexController;
	public static void main(String[] args) {
		SpringApplication.run(ExchangeConnectivityApplication.class, args);
	}

	@GetMapping
	public String indexRoute() {
		System.out.println("We hit index");
		return indexController.toString();
	}

}
