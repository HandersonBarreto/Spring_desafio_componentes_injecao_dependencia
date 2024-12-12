package com.devsuperior.desafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio.entity.Order;
import com.devsuperior.desafio.service.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	OrderService orderService;

	public DesafioApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.printf("Pedido código: " + order.getCode());
		System.out.println();
		System.out.printf("Valor total: R$ " + orderService.total(order));

	}

}
