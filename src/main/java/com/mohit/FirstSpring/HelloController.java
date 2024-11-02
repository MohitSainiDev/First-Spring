package com.mohit.FirstSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello/{name}")
	public HelloResponse HelloParam(@PathVariable String name) {
		return new HelloResponse("Hello " + name);
	}

	@GetMapping("/hello")
	public HelloResponse Hello() {
		return new HelloResponse("Hello World");
	}

	@PostMapping("/hello")
	public HelloResponse helloPost(@RequestBody String name) {
		return new HelloResponse("Hello " + name + "!");
	}
}

