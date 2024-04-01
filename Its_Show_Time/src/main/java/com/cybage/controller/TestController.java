package com.cybage.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test1")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String test1() {
		return "Handler1";
	}

	@GetMapping("/test2")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String test2() {
		return "Handler2";
	}

	@GetMapping("/test3")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String test3() {
		return "Handler3";
	}

}
