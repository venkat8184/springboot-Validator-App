package com.validator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
@SpringBootApplication
public class ValidatorApplication {

HashMap<Integer,String> hash=new HashMap<Integer,String>();
//Venkatramana is Updating
//Something in venkat folder
public final String name="venkatramana";

	public static void main(String[] args) {
		SpringApplication.run(ValidatorApplication.class, args);
	}

}
