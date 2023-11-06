package com.harsh.sbet.clr.roomclr;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Slf4j
public class RoomClrApplication {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate){
		return args -> {
			try {
				log.info("Starting the CLR Application ");
				ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/v1/room", HttpMethod.GET, null, new ParameterizedTypeReference<>() {
				});
				Optional.ofNullable(rooms.getBody()).ifPresent(p -> p.forEach(room -> log.info(room.toString())));
				log.info("Finishing the CLR Application ");
			}
			catch(Exception ex){
				log.debug("Some problem occured",ex.getMessage());
			}
			for(int i=1;i<=100;i++){
				if(i%3==0 && i%5 ==0) log.info("FizzBuzz");
				else if(i%3==0) log.info("Fizz");
				else if(i%5==0) log.info("Buzz");
				else log.info("Number: "+i);
			}
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(RoomClrApplication.class, args);
	}

}
