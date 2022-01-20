package org.bsocquet.holidays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication()
public class HolidaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolidaysApplication.class, args);
	}

}
