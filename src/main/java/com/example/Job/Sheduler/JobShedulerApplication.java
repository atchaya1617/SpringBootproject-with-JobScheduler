package com.example.Job.Sheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobShedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobShedulerApplication.class, args);
	}

}
