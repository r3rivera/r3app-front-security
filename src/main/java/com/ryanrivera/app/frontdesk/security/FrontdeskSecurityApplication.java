package com.ryanrivera.app.frontdesk.security;

import com.ryanrivera.app.frontdesk.security.config.RsaKeyProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Slf4j
@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class FrontdeskSecurityApplication {

	public static void main(String[] args) {
		log.info("### Starting Frontdesk Application Security....");
		SpringApplication.run(FrontdeskSecurityApplication.class, args);
		log.info("### Starting Frontdesk Application Security....Started");
	}

}
