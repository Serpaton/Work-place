package com.example.NewsBlogg.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.NewsBlogg.dto.RequestPassword;

@Controller
@RestController

public class APIController {
	
//	@GetMapping("/sayHello")
//	private ResponseEntity<?> sendHello(@RequestParam(name="n")String parameter,
//			                            @RequestParam(name="age", required=false,defaultValue="0")Integer age){
//		return ResponseEntity.status(418).body("Привет" + parameter + "(" + age + ")");
//	}
//	
//	@GetMapping("/getId/{id}")
//	private String getId(@PathVariable(name="id")String id) {
//		return "Id пользователя" + id;
//	}
//	
	@PostMapping("/pasword")
	private String checkPassword(@RequestBody RequestPassword request) {
		if(request.getPassword().equals("secret"))
		    return "Успешно вошли";
		else
			return "Пароль веден неверно";
	}

}
