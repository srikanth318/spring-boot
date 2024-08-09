package com.java8;

import java.util.Arrays;
import java.util.List;

public class FilterOrders {

	public static void main(String[] args) {

		
		
		
		List<Order> orderlist = Arrays.asList(new Order(1, List.of(new Product(101, 500))),
					  new Order(1, List.of(new Product(102, 400))),
					  new Order(2, List.of(new Product(103, 800))),
					  new Order(3, List.of(new Product(104, 900))));
		
		
		
		List<Order> list = orderlist.stream().filter(order->order.getProducts().stream().anyMatch(p->p.getProductPrice()>500)).toList();		
		
		list.forEach(p->{System.out.println("Order ID: "+p.getOrderId());
		System.out.println("Products:");
		p.getProducts().forEach(k->{System.out.println("  Product ID: "+k.getProductId());
		System.out.println("  Product Price: "+k.getProductPrice());
		System.out.println();});
		
		
		});
		
		
		/*
		 * List<Order> orders = new ArrayList<>();
		 * 
		 * orders.add(new Order(1, List.of(new Product(101, 300.0), new Product(102,
		 * 600.0)))); orders.add(new Order(2, List.of(new Product(201, 450.0), new
		 * Product(202, 700.0)))); orders.add(new Order(3, List.of(new Product(301,
		 * 550.0), new Product(302, 800.0))));
		 * 
		 * 
		 * List<Order> filteredOrders = orders.stream()
		 * .filter(o->o.getProducts().stream() .anyMatch(product ->
		 * product.getProductPrice() > 500)) .toList();
		 * 
		 * 
		 * filteredOrders.forEach(order -> { System.out.println("Order ID: " +
		 * order.getOrderId()); System.out.println("Products:");
		 * order.getProducts().forEach(product -> { System.out.println("  Product ID: "
		 * + product.getProductId()); System.out.println("  Product Price: " +
		 * product.getProductPrice()); }); System.out.println(); });
		 */
		
		
	}

}
