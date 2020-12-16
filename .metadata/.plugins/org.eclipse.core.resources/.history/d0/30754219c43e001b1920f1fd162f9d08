package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class App {
	public static void main(String[] args) {
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Books> books = restTemplate.getForEntity("http://localhost:8080/book/5434", Books.class);
//		System.out.println(books.getBody().getAuthor());

		// post call
//		createBook();
		// put call
		updateBook();
		// delete call
	}

	private static void updateBook() { 
		RestTemplate restTemplate = new RestTemplate();
		Books request = new Books();
		request.setAuthor("Pariwesh Gupta");
		request.setBookid(3443);
		request.setBookname("Spring book");
		request.setPrice(3443);
		restTemplate.put("http://localhost:8080/books", request);
	}

	private static void createBook() {
		RestTemplate restTemplate = new RestTemplate();
		Books request = new Books();
		request.setAuthor("Pariwesh");
		request.setBookid(3443);
		request.setBookname("Spring book");
		request.setPrice(3443);
		String response = restTemplate.postForObject("http://localhost:8080/books", request, String.class);
		System.out.println(response);

	}
}