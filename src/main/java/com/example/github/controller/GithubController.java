package com.example.github.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubController {

	public String check() {
		System.out.println("github");
		return null;
	}
}
