package com.example.aiod;

import com.example.aiod.model.resolvers.Mutation;
import com.example.aiod.model.resolvers.Query;
import com.example.aiod.repos.SuperCharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaGraphqlApplication {
    @Autowired
	SuperCharacterRepo superCharacterRepo;
    @Bean
	public Query query(){
    	return  new Query(superCharacterRepo);
	}
	@Bean
	public Mutation mutation(){return new Mutation(superCharacterRepo);}
	public static void main(String[] args) {
		SpringApplication.run(JavaGraphqlApplication.class, args);
	}

}
