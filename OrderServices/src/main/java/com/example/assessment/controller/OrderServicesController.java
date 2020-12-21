package com.example.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment.model.Product;
import com.example.assessment.service.OrderServices;

@RestController
@RequestMapping("/order")
public class OrderServicesController {
	@Autowired
	OrderServices orderService;
	@PostMapping
	public String createOrder(@RequestBody Product product) {
		return orderService.create(product);
	}
}
