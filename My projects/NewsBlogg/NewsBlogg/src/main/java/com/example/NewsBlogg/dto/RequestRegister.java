package com.example.NewsBlogg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class RequestRegister {

	private String name;
	private String login;
	private String password;
	
}
