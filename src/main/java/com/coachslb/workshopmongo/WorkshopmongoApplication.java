package com.coachslb.workshopmongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@SpringBootApplication
public class WorkshopmongoApplication {
	public static void main(String[] args) {
		SpringApplication.run(WorkshopmongoApplication.class, args);
	}

	@Bean
	MongoClient mongoClient(@Value("${spring.data.mongodb.uri}") String uri) {
		return MongoClients.create(uri);
	}

	@Bean
	SimpleMongoClientDatabaseFactory mongoDatabaseFactory(MongoClient mongoClient,
			@Value("${spring.data.mongodb.database}") String database) {
		return new SimpleMongoClientDatabaseFactory(mongoClient, database);
	}
}
