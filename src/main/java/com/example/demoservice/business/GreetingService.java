package com.example.demoservice.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoservice.GreetingConfigurationProperties;

@Service
public class GreetingService {
	
	private final GreetingConfigurationProperties properties;
	
	@Autowired
  public GreetingService(GreetingConfigurationProperties properties) {
		super();
		this.properties = properties;
	}


public String city() {
	  return properties.getCity();
  }
}
