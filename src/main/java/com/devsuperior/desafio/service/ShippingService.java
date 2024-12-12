package com.devsuperior.desafio.service;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entity.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		if (order.getBasic() < 100.00) {
			return 20.00;
		} else if (order.getBasic() >= 100 && order.getBasic() < 200.00) {
			return 12.00;
		} else {
			return 0.00;
		}

	}
}
