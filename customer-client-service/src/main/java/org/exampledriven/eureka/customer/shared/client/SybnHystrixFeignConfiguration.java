package org.exampledriven.eureka.customer.shared.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.ConfigurableEnvironment;

import feign.Feign;
import feign.Request;

@Configuration
public class SybnHystrixFeignConfiguration {
	@Bean
    @Scope("prototype")
    public Feign.Builder feignHystrixBuilder() {
        return Feign.builder();
    }
	
	@Bean
	Request.Options requestOptions(ConfigurableEnvironment env){
	    int ribbonReadTimeout = env.getProperty("ribbon.ReadTimeout", int.class, 60000);
	    int ribbonConnectionTimeout = env.getProperty("ribbon.ConnectTimeout", int.class, 30000);
	 
	    return new Request.Options(ribbonConnectionTimeout, ribbonReadTimeout);
	}
	

}
