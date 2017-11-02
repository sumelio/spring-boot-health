package com.example.demoservice;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoHealthIndicator extends AbstractHealthIndicator {
	
	
	private boolean running = false;

	@Override
	protected void doHealthCheck(Builder arg0) throws Exception {
		if(  running) {
			arg0.up();
		}else {
			arg0.down();
		}
		
	}
	
	@RequestMapping("/demo/{running}")	
	public void flig(@PathVariable boolean running) {
		this.running = running;
	}

	
	
}
