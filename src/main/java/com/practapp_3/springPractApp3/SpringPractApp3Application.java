package com.practapp_3.springPractApp3;

import com.practapp_3.springPractApp3.run.Location;
import com.practapp_3.springPractApp3.run.Run;
import jdk.javadoc.doclet.Taglet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class SpringPractApp3Application {

	private static final Logger showRunLog = LoggerFactory.getLogger(SpringPractApp3Application.class);

	// for the command line runner testing
	private static final Logger log = LoggerFactory.getLogger(SpringPractApp3Application.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringPractApp3Application.class, args);

		showRunLog.info("============================ Application is running ============================");
//
//		ShowPersonID showPersonID = (showPersonID) context.getBean("showPersonID");
//		System.out.println(showPersonID);

//		shoowing a simple message on the terminal
		var ShowPersonID = new ShowPersonID();
		System.out.println(ShowPersonID.sayHello());

		ShowPersonID.sayHello();
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(
					1,
					"Run Number One",
					LocalDateTime.now(),
					LocalDateTime.now().plus(1,ChronoUnit.HOURS),
					5,
					Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}
}
