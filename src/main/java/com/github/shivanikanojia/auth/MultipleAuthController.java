package com.github.shivanikanojia.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.shivanikanojia.service.MyUserDetailsService;

@RestController
public class MultipleAuthController {
	@Autowired
	private UserDetailsService userDetailService;

	@Autowired
	private MyUserDetailsService service;

	@GetMapping("/api/ping")
	public String getPing() {
		return "OK";
	}

	@GetMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password,
			@RequestHeader String Authorization) {
		AuthenticationManager manager;
		return "OK";
	}
}
