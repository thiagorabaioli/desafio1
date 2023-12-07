package tfr.dev.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tfr.dev.demo.Entities.Order;
import tfr.dev.demo.services.OrderService;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	

	
	@Autowired
	private OrderService orderService;
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order1 = new Order(1514, 100.00, 10.0);
		
		
		
		System.out.println("Order code: " + order1.getCode());
		System.out.printf("Total value: %.2f%n", orderService.total(order1));
		
	}

}
