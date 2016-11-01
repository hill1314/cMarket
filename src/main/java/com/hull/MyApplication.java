package com.hull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration  
@ComponentScan
@EnableScheduling	
@EnableAutoConfiguration
public class MyApplication {
	protected final Log logger = LogFactory.getLog(getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
