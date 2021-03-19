package com.tlc.t11;

import com.tlc.t11.Controllers.ExchangeController;
import com.tlc.t11.Controllers.IndexController;
import com.tlc.t11.Models.OrderModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class ExchangeConnectivityApplication {

	IndexController indexController;
	ExchangeController exchangeController;
	public static void main(String[] args) {
		SpringApplication.run(ExchangeConnectivityApplication.class, args);
	}
}
