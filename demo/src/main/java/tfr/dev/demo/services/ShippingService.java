package tfr.dev.demo.services;


import org.springframework.stereotype.Service;

import tfr.dev.demo.Entities.Order;

@Service
public class ShippingService {
	
	
	
	public double shipment(Order order) {
		
		    if (order.getBasic() < 100) {
		          return 20.00;

		    }
		    else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
		          return 12.00;
		          
		        } else {
		            return 0.0;
		        }

	    }
	}
