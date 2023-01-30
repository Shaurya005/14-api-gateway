package com.in28minutes.microservices.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
In the previous few steps, we implemented currency conversion microservice, currency exchange microservice, limits microservice.

In typical microservices architectures, there would be 100s of microservices like this and they have a lot of common features authentication, authorization, logging, rate limiting.
Where do you implement all these common features? That's one of the typical questions in a microservice architecture, and the typical solution is to go for an API gateway.

In the older versions of Spring Cloud, the popular API gateway to use was Zuul. Since Zuul now is no longer supported by Netflix, Spring Cloud has moved on and now the recommended
option as an API gateway is Spring Cloud Gateway. In this step, let's get started with implementing a Spring Cloud Gateway and look at the features it brings in.

Following four dependencies are added while creating this Project -

1) Spring Boot DevTools
2) Spring Boot Actuator
3) Eureka Discovery Client - For API gateway to connect to Eureka. It's a rest based service for locating services for the purpose of load balancing and failover of middle-tier servers.
					  		 We made use of the Eureka Discovery Client earlier in currency exchange and the currency conversion service as well.
4) Gateway - We are creating an API gateway. This is the Spring Cloud Routing Gateway. It provides a simple, yet effective way to route to APIs.
			 It helps you implement cross-cutting concerns such as security, monitoring/metrics and resiliency.

After creating project, we can actually launch up the API gateway application, but before we launch it up, we need to configure the application name and server port.

	spring.application.name=api-gateway
	server.port=8765

In pom.xml of api gateway, we have actuator, starter-config, netflix-eureka-client and starter-gateway which is the API gateway framework. Because of the netflix-eureka-client,
API Gateway would automatically register with Eureka. And we'll also add in the property to connect to Eureka - eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka
This is not really necessary, but I like doing that. Now launch this application.

Now if you go to Eureka and refresh, you should be able to see API Gateway in there as well. So API Gateway, currency conversion and the currency exchange are the applications
that are registered with Eureka right now. So we launched up the API gateway. Let's play with the API Gateway in the subsequent step.
 */
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
