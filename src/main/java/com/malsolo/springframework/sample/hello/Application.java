package com.malsolo.springframework.sample.hello;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	
	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}
	
	public static void main(String... args) {
		
		ConfigurableApplicationContext context =
				new AnnotationConfigApplicationContext(Application.class);
		
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		
		printer.printMessage();
		
		context.close();
		
	}

}
