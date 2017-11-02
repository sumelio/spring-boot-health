package com.example.demoservice;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greetings")
public class GreetingConfigurationProperties {

	 private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	 
	 
}
