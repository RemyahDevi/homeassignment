package com.example.billing;

import com.example.payments.Gateway;
import com.example.payments.RecurlyGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class BillingApplication {

	@Bean
	Gateway paymentGateway() {
		return new RecurlyGateway();
	}

	public static void main(String[] args) {
		SpringApplication.run(BillingApplication.class, args);
	}
}
