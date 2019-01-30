package com.chaitu.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

	@GetMapping("/docker")
	public String getMessage() {
		return "Hello from GCP";
	}
}
