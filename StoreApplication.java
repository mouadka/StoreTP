package com.store.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);

		boolean client=false;
		boolean provider=false;
		int a=0, b=0, c=0;
		Map<String, Integer> products = new HashMap<>();
		Random random = new Random();
		a = random.nextInt(11);
		b = random.nextInt(11);
		c = random.nextInt(11);

		products.put("Milk", a);
		products.put("Coffee", b);
		products.put("Sugar", c);
		System.out.println("Milk: " + a );
		System.out.println("Coffee: " + b );
		System.out.println("Sugar: " + c );


		do {
			client = random.nextBoolean();
			products.put("Milk",a--);
			products.put("Coffee",b--);
			products.put("Sugar",c--);
		}while (client == true);
		System.out.println("after client action");

		System.out.println(products);

		do {
			provider = random.nextBoolean();
			products.put("Milk",a++);
			products.put("Coffee",b++);
			products.put("Sugar",c++);

		}while (provider == true);

		System.out.println("after provider action");

		System.out.println(products);


	}




}
