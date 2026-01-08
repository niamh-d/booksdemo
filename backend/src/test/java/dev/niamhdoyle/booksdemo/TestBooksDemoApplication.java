package dev.niamhdoyle.booksdemo;

import org.springframework.boot.SpringApplication;

public class TestBooksDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(BooksDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
