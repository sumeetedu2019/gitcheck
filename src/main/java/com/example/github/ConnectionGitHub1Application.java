package com.example.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.github.controller.GithubController;

@SpringBootApplication
public class ConnectionGitHub1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionGitHub1Application.class, args);
		
		
		GithubController ghc= new GithubController();
		ghc.check();
		
	}

}
