package com.manning.application.notification.NotificationPreferencesService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.h2.tools.Server;

@SpringBootApplication
public class NotificationPreferencesServiceApplication {

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseServer() throws Exception  {
		return Server.createTcpServer(
				"-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}

	public static void main(String[] args) {
		SpringApplication.run(NotificationPreferencesServiceApplication.class, args);
	}

}
