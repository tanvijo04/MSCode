package com.example.assessment.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.example.assessment.model.Product;
import com.example.assessment.repository.ProductRepository;

@Service
public class OrderServices {
	@Autowired
	ProductRepository productRepo;
	@Autowired
	JmsTemplate jmsTemplate ;
	private static final String MESSAGE_QUEUE = "products_queue";
	public String create(Product product) {
		// TODO Auto-generated method stub
		Product prod1=new Product();
		prod1.setItemId(product.getItemId());
		prod1.setItemName(product.getItemName());
		prod1.setPrice(product.getPrice());
		prod1.setState(product.getState());
		prod1.setPin(product.getPin());
		productRepo.save(prod1);
		jmsTemplate.convertAndSend(MESSAGE_QUEUE, prod1);
		return ("Product posted : " +prod1.getItemName());
	
	}

}
