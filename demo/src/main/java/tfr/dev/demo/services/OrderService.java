package tfr.dev.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfr.dev.demo.Entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total (Order order) {
		double discount = order.getBasic() * (order.getDiscount()/100);
		return (order.getBasic() - discount) + shippingService.shipment(order);
	}
	

}
