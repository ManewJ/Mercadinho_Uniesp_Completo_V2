package com.mercadinho.mercadinho_uniesp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class  MercadinhoUniespApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercadinhoUniespApplication.class, args);
	}

}
