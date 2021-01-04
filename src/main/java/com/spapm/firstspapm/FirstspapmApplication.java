package com.spapm.firstspapm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController   // = @Controller + @ResponseBody
//@RequestMapping("/c1")
@SpringBootApplication
public class FirstspapmApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext
		SpringApplication.run(FirstspapmApplication.class, args);
	}
//
//	@GetMapping("/check")   //End Point
//	public String check(){
//		return "Hello Spring";
//	}
}
