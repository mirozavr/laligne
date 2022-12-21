package com.a77.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.a77.entity.Order;
import com.a77.repo.OrderRepo;

@Controller
public class OrderController {
	@Autowired
	private OrderRepo orderRepo;

	@GetMapping("/neworder")
	public String order(Map<String, Object> model) {
		
		Iterable<Order> orders = orderRepo.findAll();
		
		model.put("orders", orders);
		return "neworder";
	}
	
	@PostMapping("/neworder")
	public String add(
			@RequestParam String pickupPoint,
			@RequestParam String deliveryPoint,
			@RequestParam int weight,
			@RequestParam int height,
			@RequestParam int length,
			@RequestParam int width,
			@RequestParam (value = "fragileСargo", required = false) boolean fragileСargo,
			@RequestParam int pickupDate,
			@RequestParam int pickupMonth,
			@RequestParam int pickupYear,
			@RequestParam int deliveryDate,
			@RequestParam int deliveryMonth,
			@RequestParam int deliveryYear,
			@RequestParam int desiredPrice,
			Map<String, Object> model) {
		Order order = new Order(pickupPoint, deliveryPoint, weight, height, length, width, fragileСargo, pickupDate,
				                pickupMonth, pickupYear, deliveryDate, deliveryMonth, deliveryYear,desiredPrice);
		
		orderRepo.save(order);
		
        Iterable<Order> orders = orderRepo.findAll();
		
		model.put("orders", orders);
		
		return "neworder";
	}
}
