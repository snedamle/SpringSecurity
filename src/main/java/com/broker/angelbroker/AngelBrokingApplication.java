package com.broker.angelbroker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AngelBrokingApplication extends SpringBootServletInitializer{


	public static void main(String[] args) throws Exception {
		SpringApplication.run(AngelBrokingApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	private static Class<AngelBrokingApplication> applicationClass = AngelBrokingApplication.class;

}
