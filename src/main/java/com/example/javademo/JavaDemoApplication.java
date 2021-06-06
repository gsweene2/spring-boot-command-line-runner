package com.example.javademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class JavaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello world");

		List<Integer> scores = new ArrayList<>();
	}
}
