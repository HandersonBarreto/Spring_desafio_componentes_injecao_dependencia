package com.devsuperior.desafio.service;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entity.Order;

@Service
public class OrderService {

	ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(Order order) {
		double discount = order.getBasic() * order.getDiscount() / 100;
		double finalPrice = order.getBasic() - discount;
		return finalPrice + shippingService.shipment(order);
	}

}
