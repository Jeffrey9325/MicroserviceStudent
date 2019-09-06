package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.*;
@RestController
public class controllador {
	
	private static final String template = "Hola, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/saludo")
	public saludo saludo(@RequestParam(value = "name", defaultValue = "mundo") String name) {
		return new saludo(counter.incrementAndGet(),
				String.format(template, name));
	}

}
