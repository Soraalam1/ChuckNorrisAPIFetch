package com.chucknorris.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class ChuckNorrisDemoApplication {
private static final Logger log = LoggerFactory.getLogger(ChuckNorrisDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisDemoApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			Quote quote = restTemplate.getForObject(
//					"https://api.chucknorris.io/jokes/random", Quote.class);
//			log.info(quote.toString());
//		};
//	}
//
//	@Scheduled(fixedRate = 5000)
//	public void scheduler(){
//		Quote quote = restTemplate.getForObject()
//
//	}

}
