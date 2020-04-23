package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.neo.filter.TokenFilter;


@SpringBootApplication
@EnableZuulProxy
public class GatewayServiceZuulApplication {
	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceZuulApplication.class, args);
	}
}
