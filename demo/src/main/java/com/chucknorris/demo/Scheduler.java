package com.chucknorris.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Scheduler {

    private static final Logger log =
            LoggerFactory.getLogger(Scheduler.class);

    RestTemplate restTemplate = new RestTemplate();

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }



    @Scheduled(fixedRate = 5000)
    public void scheduler(){
        Quote quote = restTemplate.getForObject(
					"https://api.chucknorris.io/jokes/random", Quote.class);
			log.info(quote.toString());
    }
}
